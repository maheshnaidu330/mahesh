package com.syens.bank.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syens.bank.command.SearchCommand;
import com.syens.bank.model.User;
import com.syens.bank.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService service;

	@RequestMapping("/userRegister")
	public String userRegister(@ModelAttribute("user") User user, Model m) {
		m.addAttribute("content", "userRegister");
		return "index";
	}

	@RequestMapping("/userRegisterSer")
	public String userRegisterSer(@Valid @ModelAttribute("user") User user, BindingResult br, Model m,
			HttpSession session) {
		if (br.hasErrors())
			m.addAttribute("content", "userRegister");
		else {
			try {
				user = service.userRegister(user);
				if (user != null) {
					addUserInSession(user, session);
					m.addAttribute("content", "searchGroup");
				} else
					m.addAttribute("content", "userRegister");
			} catch (Exception e) {
				System.out.println(e);
				m.addAttribute("content", "userRegister");
				m.addAttribute("error", "Registration failed");
			}

		}
		return "index";
	}

	public void addUserInSession(User user, HttpSession session) {
		session.setAttribute("user", user);
		session.setAttribute("userId", user.getId());
		session.setAttribute("role", user.getRole());

	}

	@RequestMapping("/searchGroup")
	public String searchGroup(Model m) {
		m.addAttribute("content", "searchGroup");
		return "index";
	}

	@RequestMapping("/yourOrders")
	public String yourOrders(Model m) {
		m.addAttribute("content", "yourOrders");
		return "index";
	}

	@RequestMapping("/updateUser")
	public String updateUser(Model m, HttpSession session) {
		User user = (User) session.getAttribute("user");
		if (user == null)
			return "redirect:index";
		m.addAttribute("user", user);
		m.addAttribute("content", "updateUser");
		return "index";
	}

	@RequestMapping("/updateRegisterSer")
	public String updateRegisterSer(@Valid @ModelAttribute("user") User user, BindingResult br, Model m,
			HttpSession session) {
		if (br.hasErrors())
			m.addAttribute("content", "updateUser");
		else {
			try {
				user = service.userUpdate(user);
				if (user != null) {
					addUserInSession(user, session);
					m.addAttribute("success", "Details Updated");
				} else {
					m.addAttribute("error", "Updation failed.");
				}
				m.addAttribute("content", "updateUser");
			} catch (Exception e) {

				m.addAttribute("content", "updateUser");
				m.addAttribute("error", "Updation failed");
			}

		}
		return "index";
	}

	@RequestMapping("/searchDonor")
	public String searchDonor(@ModelAttribute("searchCommand") SearchCommand searchCommand, Model m) {
		m.addAttribute("donor", service.getDonorList(searchCommand));
		m.addAttribute("content", "searchDonor");
		return "index";
	}

	@RequestMapping("/searchDonorSer")
	public String searchDonorSer(@Valid @ModelAttribute("searchCommand") SearchCommand searchCommand, BindingResult br,
			Model m) {
		m.addAttribute("content", "searchDonor");
		return "index";
	}
}
