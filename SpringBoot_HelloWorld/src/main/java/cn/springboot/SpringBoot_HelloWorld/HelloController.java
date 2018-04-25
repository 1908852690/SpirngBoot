package cn.springboot.SpringBoot_HelloWorld;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

	
	@RequestMapping("/hello")
	public String hello()
	{
		System.out.println("hello");
		return "success";
	}
	@RequestMapping("/person")
	public Person getPerson()
	{
		Person per=new Person(1, "FLC");
		return per;
	}
	
	@RequestMapping("/personlist")
	public List<Person> getPersonList()
	{
		List<Person> perlist=new ArrayList<Person>();
		Person per1=new Person(1, "FLC1");
		Person per2=new Person(2, "FLC2");
		Person per3=new Person(3, "FLC3");
		perlist.add(per1);
		perlist.add(per2);
		perlist.add(per3);
		return perlist;
	}
	@RequestMapping("/personset")
	public Set<Person> getPersonSet()
	{
		Set<Person> perset=new HashSet<Person>();
		Person per1=new Person(1, "FLC1");
		Person per2=new Person(2, "FLC2");
		Person per3=new Person(3, "FLC3");
		perset.add(per1);
		perset.add(per2);
		perset.add(per3);
		return perset;
	}
	@RequestMapping("/personmap")
	public Map<String,Person> getPersonMap()
	{
		Map<String,Person> permap=new HashMap<String, Person>();
		Person per1=new Person(1, "FLC1");
		Person per2=new Person(2, "FLC2");
		Person per3=new Person(3, "FLC3");
		permap.put("1", per1);
		permap.put("2", per2);
		permap.put("3", per3);
		return permap;
	}
}
