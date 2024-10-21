package com.microservices.comment.controller;

import com.microservices.comment.entity.Comment;
import com.microservices.comment.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping
    public ResponseEntity<Comment> saveComment(@RequestBody Comment comment){
        Comment c = commentService.saveComment(comment);
        return new ResponseEntity<>(c, HttpStatus.OK);
    }

    @GetMapping("{postId}")
    public List<Comment> getAllCommentsByPostId(@PathVariable String postId){
       List<Comment> comments = commentService.getAllCommentsByPostId(postId);
       return comments;
    }
}
