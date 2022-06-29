package com.zxs.sharding.utils;


/**
 * @PACKAGE_NAME: com.lyl.utils
 * @ClassName: ShardingUtils
 * @Description: 分库分表的工具类
 * @Date: 2020-06-19 22:01
 **/
public class ShardingUtils {

    /**
     * 通过位运算获取一个数的绝对值, 位运算比较快
     *
     * @param value 正数或负数
     * @return
     */
    public static Integer getAbsoluteValue(Integer value) {
        Integer absoluteValue = 0;
        if (value != null) {
            absoluteValue = (value + (value >> 31)) ^ (value >> 31);
        }
        return absoluteValue;
    }


}
