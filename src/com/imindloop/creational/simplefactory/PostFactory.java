package com.imindloop.creational.simplefactory;

public class PostFactory {

    public static Post createPost(String type) {

        switch(type) {
            case "newsPost" :
                return new NewsPost();
            case "blogPost":
                return new BlogPost();
            case "productPost":
                return new ProductPost();
            default:
                throw new IllegalArgumentException("Post type is unknown.");
        }
    }
}
