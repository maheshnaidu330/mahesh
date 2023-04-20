package com.syens.bank.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syens.bank.command.LoginCommand;
import com.syens.bank.model.BloodBank;

@Controller

public class BloodBankController {

	@RequestMapping({ "/", "/index" })
	public String index(@ModelAttribute("loginCommand") LoginCommand loginCommand, Model m) {
		m.addAttribute("content", "login");
		return "index";
	}

	@RequestMapping("/login")
	public String login(@Valid @ModelAttribute("loginCommand") LoginCommand loginCommand, BindingResult br, Model m) {
		m.addAttribute("content", "login");
		return "index";
	}

	@RequestMapping("/adminRegister")
	public String adminRegister(@ModelAttribute("bloodBank") BloodBank bloodBank, Model m) {
		m.addAttribute("content", "adminRegister");
		return "index";
	}

	@RequestMapping("/adminRegisterSer")
	public String adminRegisterSer(@Valid @ModelAttribute("bloodBank") BloodBank bloodBank, BindingResult br, Model m) {
		if (br.hasErrors())
			m.addAttribute("content", "adminRegister");
		else
			m.addAttribute("content", "checkOrders");
		return "index";
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
}
