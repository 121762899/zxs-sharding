package com.zxs.sharding.algorithm;

import com.zxs.sharding.utils.ShardingUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * 自定义分片算法
 * 
 * @author zxs
 *
 */
@Slf4j
public class MyPreciseShardingAlgorithm implements PreciseShardingAlgorithm<String> {

	@Override
	public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<String> shardingValue) {
	/*	for (String tableName : availableTargetNames) {
			if (tableName.endsWith(shardingValue.getValue() % 4 + "")) {
				return tableName;
			}
		}
		throw new IllegalArgumentException();*/

		// 根据用户名的hash值对《virtualNodeCount》进行取余后，得到余数，余数一定在0，《virtualNodeCount》之间的
		Integer mod = shardingValue.getValue().hashCode() % 4;

		// 由于获取的字符串的hash值可能存在负数，所以需要需要取其绝对值
		mod = ShardingUtils.getAbsoluteValue(mod);

		for (String each : availableTargetNames) {
			// 将余数与配置的实际表名进行匹配
			if (each.endsWith(String.valueOf(mod))) {
				log.info("logic table : {}", each);
				return each;
			}
		}
		throw new UnsupportedOperationException();
	}

}
