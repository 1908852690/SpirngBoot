package cn.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.springboot.entity.Student;
@Controller
public class StudentController {
	@RequestMapping("/getStudents")
	public String getStudents(Model model)
	{
		System.out.println("--------进入Controller-----------");
		List<Student> stulist=new ArrayList<Student>();
		Student stu01=new Student("code_1","张三");
		Student stu02=new Student("code_2","李四");
		Student stu03=new Student("code_3","王五");
		stulist.add(stu01);
		stulist.add(stu02);
		stulist.add(stu03);
		model.addAttribute("Students",stulist);
		return "FreeMarker";
	}
}
