package com.codeartha.backend.controller;

import com.codeartha.backend.repository.model.BlogEntity;
import com.codeartha.backend.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/blog")

public class Blog {
    @Autowired(required = true)
    BlogService blogService;

    @PostMapping()
    public ResponseEntity<BlogEntity> create(@RequestBody BlogEntity blogEntity){
        BlogEntity craete =blogService.createBlog(blogEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(craete);
    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<BlogEntity> getBlogById(@PathVariable String id){
//        Optional<BlogEntity> data = blogService.getBlogById(id);
//        return (ResponseEntity<BlogEntity>) ResponseEntity.status(HttpStatus.OK).body(data);
//    }

    @GetMapping("/all-blogs")
    public ResponseEntity<List<BlogEntity>> getAllBlog(){
        List<BlogEntity> data = blogService.getAllBlog();
        return ResponseEntity.status(HttpStatus.OK).body(data);
    }

}
