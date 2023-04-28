package com.syens.bank.service;

import java.util.List;

import com.syens.bank.command.LoginCommand;
import com.syens.bank.command.SearchCommand;
import com.syens.bank.model.User;

public interface UserService {

	User userRegister(User user);

	User login(LoginCommand loginCommand);

	User userUpdate(User user);

	List<User> getDonorList(SearchCommand searchCommand);
	
}
