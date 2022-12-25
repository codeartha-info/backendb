package com.codeartha.backend.service;

import com.codeartha.backend.repository.model.BlogEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BlogService {
    BlogEntity createBlog(BlogEntity blogEntity);
    List<BlogEntity> getAllBlog();

    Optional<BlogEntity> getBlogById(String id);

}
