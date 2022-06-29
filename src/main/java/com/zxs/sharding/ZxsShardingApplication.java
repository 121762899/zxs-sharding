package com.zxs.sharding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot版 Sharding JDBC 不分库，只分表案例
 * 
 * @author zxs
 *
 */
@SpringBootApplication
public class ZxsShardingApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZxsShardingApplication.class, args);
	}
}
