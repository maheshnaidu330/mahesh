package com.syens.bank.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.syens.bank.command.LoginCommand;
import com.syens.bank.command.SearchCommand;
import com.syens.bank.model.User;

@Component
public class UserDao {
	JdbcTemplate template;

	@Autowired
	public UserDao(DataSource dataSource) {
		template = new JdbcTemplate(dataSource);
	}

	public int addUser(User user) {

		String sql = "insert into blooduser (name,unumber,email,password,address,bGroup,donor,gender) values (?,?,?,?,?,?,?,?)";
		return template.update(sql, user.getName(), user.getUnumber(), user.getEmail(), user.getPassword(),
				user.getAddress(), user.getbGroup(), user.getDonor(), user.getGender());

	}

	public User getHighest() {
		String sql = "select * from blooduser where id=(select max(id) from blooduser)";
		return template.queryForObject(sql, new Object[] {}, new BeanPropertyRowMapper<User>(User.class));
	}

	public User checkUserLogin(LoginCommand loginCommand) {

		String sql = "SELECT * from blooduser where unumber=? and password=?";
		return template.queryForObject(sql, new Object[] { loginCommand.getPhone(), loginCommand.getPassword() },
				new BeanPropertyRowMapper<User>(User.class));
	}

	public int updateUser(User user) {
		String sql = "update blooduser set name=?,unumber=?,email=?,password=?,address=?,bGroup=?,donor=?,gender=? where id=?";
		return template.update(sql, user.getName(), user.getUnumber(), user.getEmail(), user.getPassword(),
				user.getAddress(), user.getbGroup(), user.getDonor(), user.getGender(), user.getId());
	}

	public User getUserById(int id) {
		String sql = "select * from blooduser where id=?";
		return template.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper<User>(User.class));
	}

	/*
	 * public int login(String number, String password) { String sql =
	 * "select * from user where number =? and password=?"; User user =
	 * template.queryForObject(sql, new Object[] { number, password }, new
	 * BeanPropertyRowMapper<User>(User.class)); System.out.println(user);
	 * return user.getId(); }
	 */
	public List<User> donorSearch(String bGroup, String address) {

		return template.query("select * from user where donor='donor' and bGroup='" + bGroup + "' and address like '%"
				+ address + "%'", new RowMapper<User>() {
					public User mapRow(ResultSet rs, int row) throws SQLException {
						User e = new User();
						e.setUnumber(rs.getString(2));
						e.setName(rs.getString(1));
						e.setEmail(rs.getString(3));
						e.setAddress(rs.getString(5));
						e.setbGroup(rs.getString(6));
						System.out.println(e);
						return e;
					}

				});
	}

	public List<User> getDonorList(SearchCommand searchCommand) {
		if(searchCommand==null)
		{
			
		}
		else
		{
		return null;
		}
		return null;
	}

}
