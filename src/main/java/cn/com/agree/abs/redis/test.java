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
    public static void main(String[] args) throws InterruptedException, IOException {
        RedissonConfig redissonConfig = new RedissonConfig();
        RedissonClient redisson=null;
        try {
            redisson = redissonConfig.redisson();
            dofor(redisson);
        } catch (InterruptedException e) {
           dofor(redisson);
        }
    }

    private static void dofor(RedissonClient redisson) throws InterruptedException {
        while (true){
            Thread.sleep(1000);
            RMap<String, String> test = redisson.getMap("test");
            System.out.println(test.keySet());
            final String adf = test.get("adf");
            System.out.println(adf);
            boolean expire = test.expire(Duration.ofMillis(12345));
            System.out.println(expire);
            System.out.println("-------------------------------------------------------");
        }
    }
}
