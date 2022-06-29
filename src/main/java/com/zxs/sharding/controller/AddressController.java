package com.zxs.sharding.controller;

import com.zxs.sharding.entity.Address;
import com.zxs.sharding.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@GetMapping("/address/list")
	public Object list() {
		return addressService.list();
	}
	
	@GetMapping("/address/add")
	public Object add() {
		for (long i = 0; i < 10; i++) {
			Address address = new Address();
			address.setId(i+"");
			address.setCity("北京");
			address.setRegion("昌平");
			address.setName("张三");
			addressService.addAddress(address);
		}
		return "success";
	}
	
}
