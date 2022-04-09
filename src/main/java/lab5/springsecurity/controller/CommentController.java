package lab5.springsecurity.controller;

import lab5.springsecurity.domain.Comment;
import lab5.springsecurity.domain.dto.CommentDto;
import lab5.springsecurity.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/comments")
public class CommentController {
    @Autowired
    CommentService commentService;

    @GetMapping
    public List<CommentDto> getComments() {
        return commentService.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void addComments(@RequestBody Comment c){
        commentService.addComment(c);
    }

}
