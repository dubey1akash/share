package com.news.backend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reels {
    private Long id;

    private String title;
    private String description;
    private int duration;
    private int views;
}
