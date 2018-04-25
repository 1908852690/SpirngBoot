package cn.springboot.SpringBoot_Loader;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SpringBoot_Loader {
	
	
	@RequestMapping("/boot_loader")
	public void springboot_test()
	{
		System.out.println("ss");
	}
}
