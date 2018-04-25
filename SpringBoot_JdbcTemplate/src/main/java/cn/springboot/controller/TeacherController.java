package cn.springboot.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.springboot.entity.Teacher;
import cn.springboot.service.TeacherService;


@RestController
public class TeacherController {
	
	@Resource
	private TeacherService teacherService;
	
	@RequestMapping("/selectTeacherByName")
	public Teacher selectTeacherByName(String name)
	{
		return teacherService.selectTeacherByName(name);
	}

}
