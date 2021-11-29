package cn.com.agree.abs.design.guava.test;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-26 15:51
 */
public class CallableCaches {
    public static void main(String[] args) {
        final String key = "0101";
        Cache<Object, Optional<List<String>>> cache = CacheBuilder.newBuilder().expireAfterWrite(3, TimeUnit.SECONDS)
                .removalListener(notification -> System.out.println("cache expired, remove key : " + notification.getKey())).build();
        try {
            Optional<List<String>> optional;
            System.out.println("load from cache once : " + cache.get(key, () -> Optional.ofNullable(MockDB.getCityListFromDB(key))).orElse(null));
            Thread.sleep(2000);
            System.out.println("load from cache twice : " + cache.get(key, () -> Optional.ofNullable(MockDB.getCityListFromDB(key))).orElse(null));
            Thread.sleep(2000);
            System.out.println("load from cache third : " + cache.get(key, () -> Optional.ofNullable(MockDB.getCityListFromDB(key))).orElse(null));
            Thread.sleep(2000);
            final String nullKey = "0103";
            optional = cache.get(nullKey, () -> Optional.ofNullable(MockDB.getCityListFromDB(nullKey)));
            System.out.println("load not exist key from cache : " + optional.orElse(null));
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
