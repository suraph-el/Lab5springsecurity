package lab5.springsecurity.domain.dto;

import lombok.Data;

@Data
public class PostDto {
    private int id;
    private String title;
    private String content;
    private String author;
}
