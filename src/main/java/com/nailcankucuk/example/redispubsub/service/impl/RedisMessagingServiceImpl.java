package com.nailcankucuk.example.redispubsub.service.impl;

import com.nailcankucuk.example.redispubsub.service.RedisMessagingService;
import com.nailcankucuk.example.redispubsub.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPubSub;

/**
 * @author nailcankucuk@gmail.com
 * @date 04.11.2018
 */
@Service
public class RedisMessagingServiceImpl implements RedisMessagingService {
    private Logger logger = LoggerFactory.getLogger(getClass());
    private JedisPubSub jedisPubSub;
    private Jedis jedis;

    @Autowired
    public RedisMessagingServiceImpl(JedisPubSub jedisPubSub, Jedis jedis) {
        this.jedisPubSub = jedisPubSub;
        this.jedis = jedis;
    }

    @Override
    public Long publish(String channel, Object object) {
        return publish(channel, JsonUtil.toJson(object));
    }

    @Override
    public Long publish(String channel, String message) {
        Long reply = jedis.publish(channel, message);
        logger.info("Publish message: {}, channel: {}, host: {}, port: {}", message, channel);
        return reply;
    }

    @Override
    public void subscribe(String... channels) {
        jedis.subscribe(jedisPubSub, channels);
        logger.info("Subscribe channel: {}, host: {}, port: {}", channels);
    }
}
