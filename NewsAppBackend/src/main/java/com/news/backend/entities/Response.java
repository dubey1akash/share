package com.news.backend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatusCode;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response <T>{
    private Boolean success;
    private int statusCode;
    private HttpStatusCode status;
    private String message;
    private T data;
}
