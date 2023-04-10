package com.syena.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.syena.model.Employee;

public class EmployeeDao {
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int save(Employee employee) {
		String sql = "insert into Emp99(id,name,salary,designation) values(emp99_seq.nextval,'" + employee.getName() + "',"
				+ employee.getSalary() + ",'" + employee.getDesignation() + "')";
		return template.update(sql);

	}

	public List<Employee> all() {
		return template.query("select * from Emp99", new RowMapper<Employee>() {
			public Employee mapRow(ResultSet rs, int row) throws SQLException {
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getFloat(3));
				e.setDesignation(rs.getString(4));
				return e;
			}

		});
	}

	public Employee getById(int id) {
		String sql = "select * from emp99 where id=?";
		return template.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper<Employee>(Employee.class));

	}

	public int update(Employee p) {
		String sql = "update Emp99 set name=?,salary=?,designation=? where id=?";
		return template.update(sql, p.getName(), p.getSalary(), p.getDesignation(), p.getId());

	}

	public int deleteById(int id) {
		String sql = "delete from emp99 where id=?";
		return template.update(sql, id);

	}
}
