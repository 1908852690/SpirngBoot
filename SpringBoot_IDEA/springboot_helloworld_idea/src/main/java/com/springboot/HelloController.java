package com.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by FLC on 2018/3/26.
 */
@RestController
public class HelloController {
    @RequestMapping("/hellotest")
    public String hello()
    {
        System.out.println("hello");
        return "success";
    }
}
