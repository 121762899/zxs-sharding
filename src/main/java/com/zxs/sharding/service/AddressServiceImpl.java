package com.zxs.sharding.service;

import com.zxs.sharding.entity.Address;
import com.zxs.sharding.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressRepository addressRepository;
	
	@Override
	public List<Address> list() {
		return addressRepository.list();
	}

	@Override
	public Long addAddress(Address address) {
		return addressRepository.addAddress(address);
	}

}
