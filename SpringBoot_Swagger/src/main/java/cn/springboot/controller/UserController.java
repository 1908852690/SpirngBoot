package cn.springboot.controller;

import java.util.HashMap;
import java.util.Map;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.springboot.entity.User;

@RestController
@RequestMapping("/user")
@Api(value = "用户服务",description = "提供RESTful风格API的用户的增删改查服务")
public class UserController {
	 //模拟DAO层
    private final Map<Long, User> repository = new HashMap<Long, User>();

    @PostMapping("/add1")
    @ApiOperation("添加用户")
    public Boolean add1(@RequestBody User user) {
        repository.put(user.getId(), user);
        return true;
    }
    
    @PostMapping("/add2")
    @ApiOperation("添加用户")
    public Boolean add2(@ApiParam("用户信息")@RequestBody User user) {
        repository.put(user.getId(), user);
        return true;
    }

    @DeleteMapping("/{id}")
    @ApiOperation("通过ID删除用户")
    public Boolean delete(@PathVariable Long id) {
        repository.remove(id);
        return true;
    }

    @PutMapping
    @ApiOperation("更新用户")
    public Boolean update(@RequestBody User user) {
        repository.put(user.getId(), user);
        return true;
    }

    @GetMapping("/{id}")
    @ApiOperation("通过ID查询用户")
    public User findById(@PathVariable Long id) {
        return repository.get(id);
    }
}
