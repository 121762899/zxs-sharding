package com.zxs.sharding.service;

import com.zxs.sharding.entity.Address;

import java.util.List;

public interface AddressService {

	List<Address> list();
	
	Long addAddress(Address address);
		
}
