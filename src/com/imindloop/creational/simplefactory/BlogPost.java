package com.imindloop.creational.simplefactory;

import java.util.Arrays;

public class BlogPost extends Post{

    private String Author;
    private String[] tags;

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "BlogPost{" +
                "Author='" + Author + '\'' +
                ", tags=" + Arrays.toString(tags) +
                '}';
    }
}
