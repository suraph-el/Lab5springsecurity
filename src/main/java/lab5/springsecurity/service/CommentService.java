package lab5.springsecurity.service;

import lab5.springsecurity.domain.Comment;
import lab5.springsecurity.domain.dto.CommentDto;

import java.util.List;

public interface CommentService {
    List<CommentDto> findAll();
    void addComment(Comment c);
}
