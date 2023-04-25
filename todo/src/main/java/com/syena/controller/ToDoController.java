package com.syena.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syena.dao.ToDoDao;
import com.syena.model.ToDo;

@Controller

public class ToDoController {
	@Autowired
	ToDoDao dao;
	DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm");

	@RequestMapping("/add")
	public String add(ToDo todo) {
		todo.setDate(LocalDateTime.now().format(myFormatObj));
		dao.add(todo);
		return "index.jsp";
	}

	@RequestMapping("/addform")
	public String add(Model m) {
		m.addAttribute("todo", "addform");
		return "index.jsp";
	}

	@RequestMapping("/editTodo")
	public String edit(int id, Model m) {
		m.addAttribute("book", dao.getTodo(id));
		m.addAttribute("todo", "editform");
		return "index.jsp";
	}

	@RequestMapping("/viewall")
	public String view(Model m) {
		m.addAttribute("todo", "viewform");
		List<ToDo> list = dao.getTodos();
		m.addAttribute("list", list);
		return "index.jsp";

	}

	@RequestMapping("/update")
	public String update(ToDo todo) {
		todo.setDate(LocalDateTime.now().format(myFormatObj));
		dao.update(todo);
		return "redirect:/viewall";

	}

	@RequestMapping("/deleteBook")
	public String deleteBook(int id) {
		dao.deleteBook(id);
		return "redirect:/viewall";
	}
}
