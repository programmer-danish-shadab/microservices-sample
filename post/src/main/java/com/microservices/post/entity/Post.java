package com.microservices.post.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "posts")
public class Post {

    @Id
    private String id;
    private String title;
    private String description;
    private String content;

}
