package com.nailcankucuk.example.redispubsub.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisPubSub;

/**
 * @author nailcankucuk@gmail.com
 * @date 04.11.2018
 */
@Service
public class JedisPubSubImpl extends JedisPubSub {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void unsubscribe(String... channels) {
        super.unsubscribe(channels);
        logger.info("Redis unsubscribe. channels: {}", channels);
    }

    @Override
    public void subscribe(String... channels) {
        super.subscribe(channels);
        logger.info("Redis subscribe. channels: {}", channels);
    }

    @Override
    public void onMessage(String channel, String message) {
        super.onMessage(channel, message);
        logger.info("Redis onMessage. channel: {}, message: {}", channel, message);
    }

    @Override
    public void onPMessage(String pattern, String channel, String message) {
        super.onPMessage(pattern, channel, message);
        logger.info("Redis onPMessage.pattern: {}, channel: {}, message: {}", pattern, channel, message);
    }

    @Override
    public void onSubscribe(String channel, int subscribedChannels) {
        super.onSubscribe(channel, subscribedChannels);
        logger.info("Redis onSubscribe. channel: {}, subscribedChannels: {}", channel, subscribedChannels);
    }

    @Override
    public void onUnsubscribe(String channel, int subscribedChannels) {
        super.onUnsubscribe(channel, subscribedChannels);
        logger.info("Redis onUnsubscribe. channel: {}, subscribedChannels: {}", channel, subscribedChannels);
    }

    @Override
    public void onPUnsubscribe(String pattern, int subscribedChannels) {
        super.onPUnsubscribe(pattern, subscribedChannels);
        logger.info("Redis onPUnsubscribe. pattern: {}, subscribedChannels: {}", pattern, subscribedChannels);
    }

    @Override
    public void onPSubscribe(String pattern, int subscribedChannels) {
        super.onPSubscribe(pattern, subscribedChannels);
        logger.info("Redis onPSubscribe. pattern: {}, subscribedChannels: {}", pattern, subscribedChannels);
    }

    @Override
    public void onPong(String pattern) {
        super.onPong(pattern);
        logger.info("Redis onPong. pattern: {}", pattern);
    }
}
