package com.syens.bank.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.syens.bank.model.BloodStock;
import com.syens.bank.model.User;
@Component
public class UserDao {
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int addUser(User user) {
		String sql="insert into user (name,number,email,password,address,bGroup,donor) values (?,?,?,?,?,?,?)";
		return template.update(sql,user.getName(),user.getNumber(),user.getEmail(),user.getPassword(),user.getAddress(),user.getbGroup(),user.getDonor());

	}

	public List<User> donorSearch(String bGroup, String address) {
	
		return template.query("select * from user where donor='donor' and bGroup='"+bGroup+"' and address like '%"+address+"%'", new RowMapper<User>() {
			public User mapRow(ResultSet rs, int row) throws SQLException {
				User e = new User();
				e.setNumber(rs.getLong(2));
				e.setName(rs.getString(1));
				e.setEmail(rs.getString(3));
				e.setAddress(rs.getString(5));
				e.setbGroup(rs.getString(6));
				System.out.println(e);
				return e;
			}

		});
	}

	public int login(String number, String password) {
			String sql="select * from user where number =? and password=?";
			User user= template.queryForObject(sql, new Object[] { number ,password}, new BeanPropertyRowMapper<User>(User.class));
			System.out.println(user);
			return user.getId();
	}

	

}
