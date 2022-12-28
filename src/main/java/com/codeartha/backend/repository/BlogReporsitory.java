package com.codeartha.backend.repository;

import com.codeartha.backend.repository.model.BlogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogReporsitory extends JpaRepository<BlogEntity, String> {
}
