package com.codeartha.backend.repository.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "blog_desc")
public class BlogEntity {
    @Id
    @Column(name = "blog_id")
    private String blogID;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "author_name")
    private String authorName;
}
