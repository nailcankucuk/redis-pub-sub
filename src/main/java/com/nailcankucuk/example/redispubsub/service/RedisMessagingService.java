package com.nailcankucuk.example.redispubsub.service;

/**
 * @author nailcankucuk@gmail.com
 * @date 04.11.2018
 */
public interface RedisMessagingService {
    Long publish(String channel, Object object);

    Long publish(String channel, String message);

    void subscribe(String... channels);
}
