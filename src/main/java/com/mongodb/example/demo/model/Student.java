package com.mongodb.example.demo.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Rahul Jaiman
 * @date 2022-03-03 2:24 AM
 */
@Data
@Document(collection = "students")
public class Student {
    private String name;
    private String id;
    private String age;
    private String city;
    private String college;
}
