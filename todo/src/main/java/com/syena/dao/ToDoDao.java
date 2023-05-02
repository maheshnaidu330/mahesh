package com.syena.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
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

	/*
	 * public List<ToDo> getTodos() { return
	 * template.query("select * from todo order by pdate desc", new
	 * RowMapper<ToDo>() { public ToDo mapRow(ResultSet rs, int row) throws
	 * SQLException { ToDo e = new ToDo(); e.setId(rs.getInt(1));
	 * e.setContent(rs.getString(3)); e.setTitle(rs.getString(2));
	 * e.setDate(rs.getString(4)); return e; } }); }
	 */

	public ResultSetExtractor<List<ToDo>> result() {
		return rs -> {
			List<ToDo> list = new ArrayList<ToDo>();
			while (rs.next()) {
				ToDo e = new ToDo();
				e.setId(rs.getInt(1));
				e.setContent(rs.getString(3));
				e.setTitle(rs.getString(2));
				e.setDate(rs.getString(4));
				list.add(e);
			}
			return list;

		};
	}

	public List<ToDo> getTodos() {
		// ResultSetExtractor<List<ToDo>> todo = rs ->
		// {
		// List<ToDo> list= new ArrayList<ToDo>();
		// while(rs.next())
		// {
		// ToDo e = new ToDo();
		// e.setId(rs.getInt(1));
		// e.setContent(rs.getString(3));
		// e.setTitle(rs.getString(2));
		// e.setDate(rs.getString(4));
		// list.add(e);
		// }
		// return list;

		// };

		return template.query("select * from todo order by pdate desc", result());
	}

	// new ResultSetExtractor<List<ToDo>>(){
	// @Override
	// public List<ToDo> extractData(ResultSet rs) throws SQLException,
	// DataAccessException {
	//
	// List<ToDo> list= new ArrayList<ToDo>();
	// while(rs.next())
	// {
	// ToDo e = new ToDo();
	// e.setId(rs.getInt(1));
	// e.setContent(rs.getString(3));
	// e.setTitle(rs.getString(2));
	// e.setDate(rs.getString(4));
	// list.add(e);
	// }
	// return list;
	// }
	// });
	// }

	/*
	 * RowMapper<ToDo> rowmapper = (rs, rowNum) -> { ToDo e = new ToDo();
	 * e.setId(rs.getInt(1)); e.setContent(rs.getString(3));
	 * e.setTitle(rs.getString(2)); e.setDate(rs.getString(4)); return e; };
	 * 
	 */

	// return template.query("select * from todo order by pdate desc", (rs,
	// rowNum) -> {
	// System.out.println(rowNum);
	// ToDo e = new ToDo();
	// e.setId(rs.getInt(1));
	// e.setContent(rs.getString(3));
	// e.setTitle(rs.getString(2));
	// e.setDate(rs.getString(4));
	// return e;
	// });

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
