package com.zxs.sharding.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 分表
 * @author zxs
 *
 */
@Data
public class User implements Serializable {

	private static final long serialVersionUID = -1;
	
	private Long id;

	private String city = "";
	
	private String name = "";


}
