package com.syens.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syens.bank.command.LoginCommand;
import com.syens.bank.command.SearchCommand;
import com.syens.bank.dao.UserDao;
import com.syens.bank.model.User;

@Service
public class UserServiceImp implements UserService {
	@Autowired
	UserDao dao;

	@Override
	public User userRegister(User user) {
		if (dao.addUser(user) == 1) {
			return dao.getHighest();
		} else
			return null;
	}

	@Override
	public User login(LoginCommand loginCommand) {
		if (loginCommand.getRole() == 1) {
			User user = dao.checkUserLogin(loginCommand);
			return user;
		}

		return null;
	}

	@Override
	public User userUpdate(User user) {
		if(dao.updateUser(user)==1)
			return dao.getUserById(user.getId());
		else
		return null;
	}

	@Override
	public List<User> getDonorList(SearchCommand searchCommand) {
		
		return dao.getDonorList(searchCommand);
	}
}
