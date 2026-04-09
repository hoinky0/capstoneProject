package com.example.demo.dto;

import com.example.demo.entity.PostMode;
import com.example.demo.entity.PostType;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Getter
@NoArgsConstructor
public class PostRequestDto {
    private String title;
    private String content;
    private PostType type;
    private Integer capacity;
    private LocalDate deadline;
    private PostMode mode;
    private String location;
    private List<String> tags;
}
