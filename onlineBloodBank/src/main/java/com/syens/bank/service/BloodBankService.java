package com.syens.bank.service;





import com.syens.bank.command.LoginCommand;
import com.syens.bank.model.BloodBank;
import com.syens.bank.model.BloodStock;

public interface BloodBankService {

	BloodBank adminRegister(BloodBank bloodBank);

	BloodBank login(LoginCommand loginCommand);

	BloodBank userUpdate(BloodBank bloodBank);

	BloodStock getStock(int bId);

	BloodStock stockUpdate( BloodStock bloodstock);

}
