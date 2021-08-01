package com.imindloop.creational.simplefactory;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PostClient {

    public static void main(String[] args) {
        Post post = PostFactory.createPost("blogPost");
        System.out.println(post);
    }
}
