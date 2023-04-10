package com.syena.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syena.dao.EmployeeDao;
import com.syena.model.Employee;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeDao employeedao;

	@RequestMapping("/register")
	public String showform(Model m) {
		return "register";
	}

	@RequestMapping("/add")
	public String add(Employee employee) {

		employeedao.save(employee);
		return "redirect:/viewemp";
	}

	@RequestMapping("/viewemp")
	public String all(Model model, String message) {
		model.addAttribute("message", message);
		List<Employee> list = employeedao.all();
		model.addAttribute("list", list);
		return "viewemployees";
	}

	@GetMapping(value = "/update/{id}")
	public String update(@PathVariable int id, Model model) {
		model.addAttribute("employee", employeedao.getById(id));
		return "updation";
	}

	@RequestMapping("/updated")
	public String editsave(Employee employee, Model m) {
		if (employeedao.update(employee) != 1)
			m.addAttribute("message", "NOt Updated Check Once");
		else
			m.addAttribute("message", "Updated Successfully");

		return "redirect:/viewemp";
	}

	@GetMapping(value = "/delete/{id}")
	public String delete(@PathVariable int id) {
		employeedao.deleteById(id);
		return "redirect:/viewemp";
	}
}
