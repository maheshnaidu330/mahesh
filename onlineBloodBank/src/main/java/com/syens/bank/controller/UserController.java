package com.syens.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@RequestMapping("/userRegister")
	public String userRegister(Model m)
	{
		m.addAttribute("content", "userRegister");
		return "index";
	}
	@RequestMapping("/searchGroup")
	public String searchGroup(Model m)
	{
		m.addAttribute("content", "searchGroup");
		return "index";
	}
	@RequestMapping("/yourOrders")
	public String yourOrders(Model m)
	{
		m.addAttribute("content", "yourOrders");
		return "index";
	}
	@RequestMapping("/updateUser")
	public String updateUser(Model m)
	{
		m.addAttribute("content", "updateUser");
		return "index";
	}

	
}
