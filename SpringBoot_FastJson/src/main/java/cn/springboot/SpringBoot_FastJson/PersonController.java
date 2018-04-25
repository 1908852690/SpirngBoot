package cn.springboot.SpringBoot_FastJson;


import java.util.Date;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonController {
	@RequestMapping("/person")
	public Person getPerson()
	{
		Person per=new Person(1, "ttt",new Date());
		return per;
	}
	@RequestMapping("/personBean")
	public PersonBean getPersonBean()
	{
		PersonBean per=new PersonBean(1, "FLC",new Date());
		return per;
	}
	
	
}
