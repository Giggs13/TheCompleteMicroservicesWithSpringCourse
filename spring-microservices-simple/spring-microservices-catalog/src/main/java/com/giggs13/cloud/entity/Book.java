package com.giggs13.cloud.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Book {

    @Id
    private long bookId;
    private String title;
    private int pageCount;
    private String authorFirstName;
    private String authorLastName;
}
