package com.example.demo.dto;

import com.example.demo.entity.Post;
import com.example.demo.entity.PostMode;
import com.example.demo.entity.PostStatus;
import com.example.demo.entity.PostType;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
public class PostResponseDto {
    private final Long id;
    private final String authorNickname;
    private final String title;
    private final String content;
    private final PostType type;
    private final Integer capacity;
    private final LocalDate deadline;
    private final PostMode mode;
    private final String location;
    private final PostStatus status;
    private final LocalDateTime createdAt;
    private final List<String> tags;

    public PostResponseDto(Post post) {
        this.id = post.getId();
        this.authorNickname = post.getAuthor().getNickname();
        this.title = post.getTitle();
        this.content = post.getContent();
        this.type = post.getType();
        this.capacity = post.getCapacity();
        this.deadline = post.getDeadline();
        this.mode = post.getMode();
        this.location = post.getLocation();
        this.status = post.getStatus();
        this.createdAt = post.getCreatedAt();
        this.tags = post.getTags().stream()
                .map(tag -> tag.getName())
                .toList();
    }
}
