package com.example.easy_school_app.models;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class BaseEntity {
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;
}