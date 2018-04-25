package cn.springboot.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;

import cn.springboot.entity.Teacher;
import cn.springboot.service.TeacherService;

@RestController
public class TeacherController {
	@Resource
	private TeacherService teacherService;
	@RequestMapping("/getAllTeacher")
	public List<Teacher> getAllTeacher()
	{
		PageHelper.startPage(1, 1);
		return teacherService.getAllTeacher();
	}
}
