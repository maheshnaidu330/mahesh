package com.syens.bank.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.syens.bank.command.LoginCommand;
import com.syens.bank.model.BloodBank;
import com.syens.bank.model.BloodStock;

@Repository
public class BloodBankDao {
	JdbcTemplate template;

	@Autowired
	public BloodBankDao(DataSource dataSource) {
		template = new JdbcTemplate(dataSource);
	}

	public int bankRegister(BloodBank bloodBank) {
		String sql = "insert into bloodbank (bId,bName,bNumber,bEmail,bPassword,bAddress) values (mahesh_perikela_emp_seq.nextval,?,?,?,?,?)";
		return template.update(sql, bloodBank.getbName(), bloodBank.getbNumber(), bloodBank.getbEmail(),
				bloodBank.getbPassword(), bloodBank.getbAddress());

	}

	public BloodBank getHighest() {

		String sql = "select * from bloodbank where bid=(select max(bid) from bloodbank)";
		return template.queryForObject(sql, new Object[] {}, new BeanPropertyRowMapper<BloodBank>(BloodBank.class));
	}

	public BloodBank checkAdminLogin(LoginCommand loginCommand) {
		String sql = "SELECT * from bloodbank where bnumber=? and bpassword=?";
		return template.queryForObject(sql, new Object[] { loginCommand.getPhone(), loginCommand.getPassword() },
				new BeanPropertyRowMapper<BloodBank>(BloodBank.class));
	}

	public int updateUser(BloodBank bloodBank) {
		String sql = "update bloodbank set bName=?,bNumber=?,bEmail=?,bPassword=?,bAddress=? where bId=?";
		return template.update(sql, bloodBank.getbName(), bloodBank.getbNumber(), bloodBank.getbEmail(),
				bloodBank.getbPassword(), bloodBank.getbAddress(), bloodBank.getbId());
	}

	public BloodBank getUserById(int getbId) {
		String sql = "SELECT * from bloodbank where bId=?";
		return template.queryForObject(sql, new Object[] { getbId },
				new BeanPropertyRowMapper<BloodBank>(BloodBank.class));
	}

	public BloodStock getStockById(int bId) {
		String sql = "SELECT * from bloodstock where id=?";
		return template.queryForObject(sql, new Object[] { bId },
				new BeanPropertyRowMapper<BloodStock>(BloodStock.class));
	}

	public int updateStock(BloodStock bloodStock) {
		 String sql ="update bloodstock set aPos=?,bPos=?,abPos=?,oPos=?,aNeg=?,bNeg=?,abNeg=?,oNeg=? where id=?";
		 return template.update(sql,bloodStock.getaPos(),bloodStock.getbPos(),bloodStock.getAbPos(),bloodStock.getoPos(),bloodStock.getaNeg(),bloodStock.getbNeg(),bloodStock.getAbNeg(),bloodStock.getoNeg(),bloodStock.getid());

	}

	
	/*
	 * public int getBloodBankId(long bNumber) { String sql =
	 * "select * from bloodbank where bNumber=?"; return template
	 * .queryForObject(sql, new Object[] { bNumber }, new
	 * BeanPropertyRowMapper<BloodBank>(BloodBank.class)) .getbId(); }
	 * 
	 * public int addStock(int bloodBankId) { String sql =
	 * "insert into bloodStock (bId) values(?)"; return template.update(sql,
	 * bloodBankId);
	 * 
	 * }
	 * 
	 * public BloodStock getBloodStock(int bId) { String sql =
	 * "select * from bloodStock where bId=?"; return
	 * template.queryForObject(sql, new Object[] { bId }, new
	 * BeanPropertyRowMapper<BloodStock>(BloodStock.class)); }
	 * 
	 * public int updateBloodStock(BloodStock bloodStock) { String sql =
	 * "update bloodStock set aPos=?,bPos=?,abPos=?,oPos=?,aNeg=?,bNeg=?,abNeg=?,oNeg=? where bId=?"
	 * ; return template.update(sql, bloodStock.getaPos(), bloodStock.getbPos(),
	 * bloodStock.getAbPos(), bloodStock.getoPos(), bloodStock.getaNeg(),
	 * bloodStock.getbNeg(), bloodStock.getAbNeg(), bloodStock.getoNeg(),
	 * bloodStock.getbId());
	 * 
	 * }
	 */

}
