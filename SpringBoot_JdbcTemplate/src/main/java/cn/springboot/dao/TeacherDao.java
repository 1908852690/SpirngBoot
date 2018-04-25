package cn.springboot.dao;

import javax.annotation.Resource;




import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import cn.springboot.entity.Teacher;


@Repository
public class TeacherDao {
	@Resource
	private JdbcTemplate jdbctemplate;	//注入模板
	
	public Teacher selectTeacherByName(String name)
	{
		//01.定义SQL语句
		String sql="select * from teacher where tname=?";
		//02.定义RowMapper
		RowMapper<Teacher> rowMapper = new BeanPropertyRowMapper<Teacher>(Teacher.class);
		Teacher teacher = jdbctemplate.queryForObject(sql,rowMapper,name);
		return teacher;
	}
}
