package cn.com.agree.abs.design.guava.test;


import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @author liugeng
 * @description TODO
 * @date 2021-11-26 14:55
 */
public class LoadingCaches {
    public static void main(String[] args) {
        LoadingCache<String, Optional<List<String>>> loadingCache = CacheBuilder.newBuilder().expireAfterWrite(3, TimeUnit.SECONDS).removalListener(notification ->
            System.out.println("去掉无效日期的秘钥expire key")
        ).build(new CacheLoader<String, Optional<List<String>>>() {
            @Override
            public Optional<List<String>> load(String key) {

                return Optional.of(MockDB.getCityListFromDB(key));
            }
        });
        try {
            System.out.println("load from cache once : " + loadingCache.get("0101").orElse(Lists.newArrayList()));
            Thread.sleep(2000);
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("load from cache two : " + loadingCache.get("0101").orElse(Lists.newArrayList()));
            Thread.sleep(2000);
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("load from cache three : " + loadingCache.get("0101").orElse(Lists.newArrayList()));
            Thread.sleep(2000);
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("load not exist key from cache : " + loadingCache.get("0102").orElse(Lists.newArrayList()));
            System.out.println("load not exist key from cache : " + loadingCache.get("0103").orElse(Lists.newArrayList()));

        } catch (ExecutionException | InterruptedException e) {
            //记录日志
        }
    }
}
