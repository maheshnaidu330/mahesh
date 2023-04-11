package com.syens.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syens.bank.dao.BloodBankDao;
import com.syens.bank.model.BloodBank;
import com.syens.bank.model.BloodStock;

@Controller
public class BloodBankController {
	@Autowired
	BloodBankDao bloodBankDao;
	@RequestMapping("/bankRegistration")
	public String bankRegistration()
	{
		return "bankRegistration";
	}
	@RequestMapping("/bankRegister")
	public String bankRegister(BloodBank bloodBank)
	{
		bloodBankDao.bankRegister(bloodBank);
		int i=bloodBankDao.addStock(bloodBankDao.getBloodBankId(bloodBank.getbNumber()));
		return "bankBody";
	}
	@RequestMapping("/updateBloodGroup")
	public String updateBloodGroup(Model model)
	{
		int aId=5;
		model.addAttribute("bloodStock", bloodBankDao.getBloodStock(aId));
		return "updateBloodStockForm";
		
	}
	@RequestMapping("/updateBloodStock")
	public String updateBloodStock(BloodStock bloodStock)
	{
		bloodBankDao.updateBloodStock(bloodStock);
		return "bankBody";
	}
}
