package lab5.springsecurity.service.serviceImpl;

import lab5.springsecurity.domain.Post;
import lab5.springsecurity.domain.dto.PostDto;
import lab5.springsecurity.repository.PostRepo;
import lab5.springsecurity.service.PostService;
import lab5.springsecurity.util.ListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepo postRepo;

    @Autowired
    ListMapper listMapper;

    @Autowired
    ListMapper<Post, PostDto> listMapperPostToDto;

    @Override
    public List<PostDto> findAll() {
        return (List<PostDto>)listMapperPostToDto.mapList(postRepo.findAll(),new PostDto());
    }

    @Override
    public void addPost(Post p) {
        postRepo.save(p);
    }

}