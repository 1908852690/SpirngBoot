package cn.springboot.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.springboot.dao.TeacherDao;
import cn.springboot.entity.Teacher;

@Service
public class TeacherService {
	@Resource
	private TeacherDao teacherDao;
	
	public List<Teacher> getAllTeacher(){
		return teacherDao.getAllTeacher();
	}
	
}
