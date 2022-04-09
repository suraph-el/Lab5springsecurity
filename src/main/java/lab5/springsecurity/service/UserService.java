package lab5.springsecurity.service;

import lab5.springsecurity.domain.User;
import lab5.springsecurity.domain.dto.PostDto;
import lab5.springsecurity.domain.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> findAll();
    void save(User u);
    UserDto findById(int id);
    List<PostDto> findPostById(int id);
    void delete(int id);
    List<UserDto> findUsersByNumberOfPosts(int n);
}
