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
import com.syens.bank.model.BloodStock;
import com.syens.bank.model.User;
import com.syens.bank.service.BloodBankService;
import com.syens.bank.service.UserService;

@Controller

public class BloodBankController {
	@Autowired
	BloodBankService service;

	@Autowired
	UserService service2;
	@Autowired
	UserController usercon;

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
			if (loginCommand.getRole() == 2) {
				BloodBank bloodBank = null;
				try {
					bloodBank = service.login(loginCommand);
					addUserInSession(bloodBank, session);
					m.addAttribute("content", "checkOrders");
				} catch (Exception ee) {
					m.addAttribute("content", "login");
					return "redirect:index?act=login";
				}

			} else {
				try {
					User user = service2.login(loginCommand);
					m.addAttribute("content", "searchGroup");
					usercon.addUserInSession(user, session);

				} catch (Exception ee) {
					m.addAttribute("content", "login");
					m.addAttribute("error", "Invalid credentials");
				}
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

	@RequestMapping("/updateBank")
	public String updateBank(Model m, HttpSession session) {
		BloodBank b = (BloodBank) session.getAttribute("user");
		if (b == null)
			return "redirect:index";
		m.addAttribute("bloodBank", b);
		m.addAttribute("content", "updateBank");
		return "index";
	}

	@RequestMapping("/adminUpdateSer")
	public String updateRegisterSer(@Valid @ModelAttribute("bloodBank") BloodBank bloodBank, BindingResult br, Model m,
			HttpSession session) {
		if (br.hasErrors())
			m.addAttribute("content", "updateBank");
		else {
			try {
				bloodBank = service.userUpdate(bloodBank);
				if (bloodBank != null) {
					addUserInSession(bloodBank, session);
					m.addAttribute("success", "Details Updated");
				} else {
					m.addAttribute("error", "Updation failed.");
				}
				m.addAttribute("content", "updateBank");
			} catch (Exception e) {

				m.addAttribute("content", "updateBank");
				m.addAttribute("error", "Updation failed");
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
	public String updateGroup(Model m, HttpSession session) {

		BloodBank b = (BloodBank) session.getAttribute("user");
		if (b == null)
			return "redirect:index";

		m.addAttribute("bloodStock", service.getStock(b.getbId()));

		m.addAttribute("content", "updateGroup");
		return "index";
	}

	@RequestMapping("/bloodstockSer")
	public String updateRegisterSer(@Valid @ModelAttribute("bloodStock") BloodStock bloodstock, BindingResult br,
			Model m, HttpSession session) {
		if (br.hasErrors())
			m.addAttribute("content", "updateGroup");
		else {
			try {
				bloodstock = service.stockUpdate(bloodstock);
				if (bloodstock != null) {
					m.addAttribute("success", "Details Updated");
				} else {
					m.addAttribute("error", "Updation failed.");
				}
				m.addAttribute("content", "updateGroup");
			} catch (Exception e) {

				m.addAttribute("content", "updateGroup");
				m.addAttribute("error", "Updation failed");
			}

		}
		return "index";
	}

	@RequestMapping("/checkOrders")
	public String checkOrders(Model m) {
		m.addAttribute("content", "checkOrders");
		return "index";
	}



	@RequestMapping("/logout")
	public String logout(HttpSession session, Model m) {
		session.invalidate();
		m.addAttribute("success", "logout successful");
		m.addAttribute("loginCommand", new LoginCommand());
		m.addAttribute("content", "login");

		return "index";
	}
}
