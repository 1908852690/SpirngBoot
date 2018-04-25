package cn.springboot.SpringBoot_FastJson;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Person {
	private Integer id;
	private String name;
	@JSONField(format="yyyy-MM-dd")
	private Date time;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Person(Integer id, String name, Date time) {
		super();
		this.id = id;
		this.name = name;
		this.time = time;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getName() {
		return name;
	}
	public Person(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
