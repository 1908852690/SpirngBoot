package cn.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import cn.springboot.entity.Teacher;

public interface TeacherDao {
	@Select("select * from teacher")
	public List<Teacher> getAllTeacher();
}
