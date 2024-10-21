package com.microservices.comment.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "comments")
public class Comment {

    @Id
    private String commentId;
    private String name;
    private String email;
    private String body;
    private String postId;
}
