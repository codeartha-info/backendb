package com.codeartha.backend.service;

import com.codeartha.backend.repository.BlogReporsitory;
import com.codeartha.backend.repository.model.BlogEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BlogServiceImpl implements BlogService{
    @Autowired(required = true)
    BlogReporsitory blogReporsitory;

    @Override
    public BlogEntity createBlog(BlogEntity blogEntity) {
        String randomUIID = UUID.randomUUID().toString();
        blogEntity.setBlogID(randomUIID);
        return blogReporsitory.save(blogEntity);
    }

    @Override
    public List<BlogEntity> getAllBlog() {
        return blogReporsitory.findAll();
    }

    @Override
    public Optional<BlogEntity> getBlogById(String id) {
        return blogReporsitory.findById(id);
    }


}
