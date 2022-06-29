package com.zxs.sharding.controller;

import com.zxs.sharding.entity.User;
import com.zxs.sharding.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/user/list")
	public Object list() {
		return userService.list();
	}
	
	@GetMapping("/user/add")
	public Object add() {
		for (long i = 0; i < 100; i++) {
			User user = new User();
			user.setId(i);
			user.setCity("北京");
			user.setName("张三"+i);
			userService.add(user);
		}
		return "success";
	}
	
	@GetMapping("/user/{id}")
	public Object get(@PathVariable Long id) {
		return userService.findById(id);
	}
	
	@GetMapping("/user/query")
	public Object get(String name) {
		return userService.findByName(name);
	}
	
}
