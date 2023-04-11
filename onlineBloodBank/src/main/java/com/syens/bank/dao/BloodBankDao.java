package com.syens.bank.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.syens.bank.model.BloodBank;
import com.syens.bank.model.BloodStock;

public class BloodBankDao {
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int  bankRegister(BloodBank bloodBank) {
		String sql="insert into bloodbank (bName,bNumber,bEmail,bPassword,bAddress) values (?,?,?,?,?)";
		return template.update(sql,bloodBank.getbName(),bloodBank.getbNumber(),bloodBank.getbEmail(),bloodBank.getbPassword(),bloodBank.getbAddress());

	}

	public int getBloodBankId(long bNumber) {
	String sql ="select * from bloodbank where bNumber=?";	
	return template.queryForObject(sql, new Object[] { bNumber }, new BeanPropertyRowMapper<BloodBank>(BloodBank.class)).getbId();
	}

	public int addStock(int bloodBankId) {
		String sql="insert into bloodStock (bId) values(?)";
		return template.update(sql,bloodBankId);
		
	}

	public BloodStock getBloodStock(int bId) {
		String sql ="select * from bloodStock where bId=?";	
		return template.queryForObject(sql, new Object[] { bId }, new BeanPropertyRowMapper<BloodStock>(BloodStock.class));
		}

	public int updateBloodStock(BloodStock bloodStock) {
		String sql="update bloodStock set aPos=?,bPos=?,abPos=?,oPos=?,aNeg=?,bNeg=?,abNeg=?,oNeg=? where bId=?";
		return template.update(sql,bloodStock.getaPos(),bloodStock.getbPos(),bloodStock.getAbPos(),bloodStock.getoPos(),bloodStock.getaNeg(),bloodStock.getbNeg(),bloodStock.getAbNeg(),bloodStock.getoNeg(),bloodStock.getbId());

	}

	
}
