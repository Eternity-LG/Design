package cn.com.agree.abs.redis;


import org.redisson.api.RMap;
import org.redisson.api.RedissonClient;

import java.io.IOException;
import java.time.Duration;

/**
 * @author liugeng
 * @description TODO
 * @date 2022-03-09 16:48
 */
public class test {
    public static void main(String[] args) {
        RedissonConfig redissonConfig = new RedissonConfig();
        long expireTime = 123000;
        try {
            RedissonClient redisson = redissonConfig.redisson();
            RMap<String, String> test = redisson.getMap("test");
            boolean expire = test.expire(Duration.ofMillis(expireTime));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
