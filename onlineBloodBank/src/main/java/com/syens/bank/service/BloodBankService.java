package com.syens.bank.service;





import com.syens.bank.command.LoginCommand;
import com.syens.bank.model.BloodBank;

public interface BloodBankService {

	BloodBank adminRegister(BloodBank bloodBank);

	BloodBank login(LoginCommand loginCommand);

}
