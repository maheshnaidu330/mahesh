package com.syens.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syens.bank.command.LoginCommand;
import com.syens.bank.dao.BloodBankDao;
import com.syens.bank.model.BloodBank;
import com.syens.bank.model.BloodStock;

@Service
public class BloodBankServiceImp implements BloodBankService{
	@Autowired
	BloodBankDao dao;
	@Override
	public BloodBank adminRegister(BloodBank bloodBank) {
		
	if( dao.bankRegister(bloodBank)==1){
		return dao.getHighest();
	}
	else 
		return null;
	}
	@Override
	public BloodBank login(LoginCommand loginCommand) {
		if(loginCommand.getRole()==2)
		  {
			BloodBank bloodBank = dao.checkAdminLogin(loginCommand);
			
			return bloodBank;
		}
		else if(loginCommand.getRole()==1)
			System.out.println("change to user login");
		return null;
	}
	@Override
	public BloodBank userUpdate(BloodBank bloodBank) {
		if(dao.updateUser(bloodBank)==1)
			return dao.getUserById(bloodBank.getbId());
		else
		return null;
	}
	@Override
	public BloodStock getStock(int bId) {
		return dao.getStockById(bId);	 
	}
	@Override
	public BloodStock stockUpdate(BloodStock bloodstock) {
		if(dao.updateStock(bloodstock)==1)
			return dao.getStockById(bloodstock.getid());
		else
		return null;
	}

}
