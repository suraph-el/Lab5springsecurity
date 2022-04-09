package lab5.springsecurity.service;

import lab5.springsecurity.domain.Post;
import lab5.springsecurity.domain.dto.PostDto;

import java.util.List;

public interface PostService {
    List<PostDto> findAll();
    void addPost(Post p);

}