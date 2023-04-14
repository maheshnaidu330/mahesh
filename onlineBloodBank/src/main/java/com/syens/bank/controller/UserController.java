package com.syens.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syens.bank.dao.UserDao;
import com.syens.bank.model.User;

import jakarta.servlet.http.HttpSession;

@Controller
@ComponentScan("com.syens.bank.dao")
public class UserController {
	@Autowired
	UserDao userDao;

	@RequestMapping("/register")
	public String addUser(User user) {
		userDao.addUser(user);
		return "userBody";
	}

	@RequestMapping("/login")
	public String login(String loginType, String number, String password, HttpSession session) {
		if (loginType.equals("bloodBank")) {

		} else {
			session.setAttribute("uid", userDao.login(number, password));
			return "userBody";

		}
		return null;

	}

	@RequestMapping("/userBody")
	public String userBody() {
		return "userBody";
	}

	@RequestMapping("/userRegistration")
	public String userRegistration() {
		return "userRegistration";
	}

	@RequestMapping("/donorSearchForm")
	public String donorSearchForm() {
		return "donorSearchForm";
	}

	@RequestMapping("/donorSearch")
	public String donorSearch(Model model, String bGroup, String address) {

		model.addAttribute("userList", userDao.donorSearch(bGroup, address));
		return "viewDonors";

	}
}
