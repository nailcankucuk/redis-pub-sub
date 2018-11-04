package com.nailcankucuk.example.redispubsub.model;

/**
 * @author nailcankucuk@gmail.com
 * @date 04.11.2018
 */
public class MessageDto {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MessageDto(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "MessageDto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
