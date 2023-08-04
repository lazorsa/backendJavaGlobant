package com.guide10.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book2 {
    private String title;
    private String author;
    private int copies;
    private int copiesBorrowed;
}
