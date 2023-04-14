package com.syena.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.syena.model.ToDo;

@Component
public class ToDoDao {
	JdbcTemplate template;

	@Autowired
	public ToDoDao(DataSource dataSource) {
		template = new JdbcTemplate(dataSource);
	}

	public int add(ToDo todo) {
		String sql = "insert into todo (id,title,content,pdate) values (maheshBooks.nextval,?,?,?)";
		return template.update(sql, todo.getTitle(), todo.getContent(), todo.getDate());
	}

	public List<ToDo> getTodos() {
		return template.query("select * from todo order by pdate desc", new RowMapper<ToDo>() {
			public ToDo mapRow(ResultSet rs, int row) throws SQLException {
				ToDo e = new ToDo();
				e.setId(rs.getInt(1));
				e.setContent(rs.getString(3));
				e.setTitle(rs.getString(2));
				e.setDate(rs.getString(4));
				return e;
			}
		});
	}

	public ToDo getTodo(int id) {
		String sql = "select * from todo where id=? ";
		return template.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper<ToDo>(ToDo.class));
	}

	public int deleteBook(int id) {
		String sql = "delete from todo where id=" + id + "";
		return template.update(sql);
	}

	public int update(ToDo library) {
		String sql = "update todo set content=?,title=?,pdate=? where id=?";
		return template.update(sql, library.getContent(), library.getTitle(), library.getDate(), library.getId());
	}
}
