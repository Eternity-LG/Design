package cn.com.agree.abs.redis;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.client.codec.StringCodec;
import org.redisson.config.Config;
import org.redisson.config.SentinelServersConfig;

import java.io.IOException;

public class RedissonConfig {
    public RedissonConfig() {
        try {
            this.redisson();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public RedissonClient redisson() throws IOException {
        // 本例子使用的是yaml格式的配置文件，读取使用Config.fromYAML，如果是Json文件，则使用Config.fromJSON
        Config config = new Config();
        SentinelServersConfig csc = config.useSentinelServers()
                .addSentinelAddress("redis://192.9.200.183:26379","redis://192.9.200.183:26380","redis://192.9.200.183:26381")
                .setMasterName("mymaster")
                .setPassword("foobared")
                .setConnectTimeout(2000)
                .setTimeout(2000)
                .setMasterConnectionMinimumIdleSize(36)
                .setMasterConnectionPoolSize(36)
                .setSlaveConnectionMinimumIdleSize(36)
                .setSlaveConnectionPoolSize(36)
                .setSubscriptionConnectionMinimumIdleSize(36)
                .setSubscriptionConnectionPoolSize(36)
                .setSubscriptionsPerConnection(36);
        //@formatter:on
        config.setCodec(new StringCodec());

        return Redisson.create(config);
    }
}