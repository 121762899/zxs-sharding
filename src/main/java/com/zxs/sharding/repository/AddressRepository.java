package com.zxs.sharding.repository;

import com.zxs.sharding.entity.Address;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface AddressRepository {
	
	Long addAddress(Address address);
	
	List<Address> list();
}
