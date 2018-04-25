package cn.springboot.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.springboot.dao.TeacherDao;
import cn.springboot.entity.Teacher;

@Service
public class TeacherService {
	@Resource
	private TeacherDao teacherDao;
	
	public Teacher selectTeacherByName(String name)
	{
		Teacher teacher = teacherDao.selectTeacherByName(name);
		return teacher;
	}
}
