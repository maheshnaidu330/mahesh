package com.syens.bank.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syens.bank.command.LoginCommand;
import com.syens.bank.model.BloodBank;
import com.syens.bank.service.BloodBankService;

@Controller

public class BloodBankController {
	@Autowired
	BloodBankService service;

	@RequestMapping({ "/", "/index" })
	public String index(Model m, HttpSession session) {
		session.invalidate();
		m.addAttribute("loginCommand", new LoginCommand());
		m.addAttribute("content", "login");
		return "index";
	}

	@RequestMapping("/login")
	public String login(@Valid @ModelAttribute("loginCommand") LoginCommand loginCommand, BindingResult br, Model m,
			HttpSession session) {
		if (br.hasErrors())
			m.addAttribute("content", "login");
		else {
			BloodBank bloodBank = null;
			try {
				bloodBank = service.login(loginCommand);
				addUserInSession(bloodBank, session);
				m.addAttribute("content", "checkOrders");
			} catch (Exception ee) {
				m.addAttribute("content", "login");
				return "redirect:index?act=login";
			}

		}
		return "index";
	}

	@RequestMapping("/adminRegister")
	public String adminRegister(@ModelAttribute("bloodBank") BloodBank bloodBank, Model m) {
		m.addAttribute("content", "adminRegister");
		return "index";
	}

	@RequestMapping("/adminRegisterSer")
	public String adminRegisterSer(@Valid @ModelAttribute("bloodBank") BloodBank bloodBank, BindingResult br, Model m,
			HttpSession session) {

		if (br.hasErrors())
			m.addAttribute("content", "adminRegister");
		else {
			try {
				bloodBank = service.adminRegister(bloodBank);
				addUserInSession(bloodBank, session);
				m.addAttribute("content", "checkOrders");
			} catch (Exception e) {
				m.addAttribute("content", "adminRegister");
				return "redirect:index?act=register";
			}
		}
		return "index";
	}

	private void addUserInSession(BloodBank bloodBank, HttpSession session) {
		session.setAttribute("user", bloodBank);
		session.setAttribute("userId", bloodBank.getbId());
		session.setAttribute("role", bloodBank.getRole());
	}

	@RequestMapping("/updateGroup")
	public String updateGroup(Model m) {
		m.addAttribute("content", "updateGroup");
		return "index";
	}

	@RequestMapping("/checkOrders")
	public String checkOrders(Model m) {
		m.addAttribute("content", "checkOrders");
		return "index";
	}

	@RequestMapping("/searchDonor")
	public String searchDonor(Model m) {
		m.addAttribute("content", "searchDonor");
		return "index";
	}

	@RequestMapping("/updateBank")
	public String updateBank(Model m) {
		m.addAttribute("content", "updateBank");
		return "index";
	}

	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		return "redirect:/index?act=logout";
	}
}
