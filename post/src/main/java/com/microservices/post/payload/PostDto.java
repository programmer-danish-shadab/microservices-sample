package com.microservices.post.payload;

import lombok.Data;

import java.util.List;


@Data
public class PostDto {

    private String postId;
    private String title;
    private String description;
    private String content;

    List<Comment> comments;

}
