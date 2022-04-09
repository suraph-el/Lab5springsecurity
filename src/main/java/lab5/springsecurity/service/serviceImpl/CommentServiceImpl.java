package lab5.springsecurity.service.serviceImpl;

import lab5.springsecurity.domain.Comment;
import lab5.springsecurity.domain.dto.CommentDto;
import lab5.springsecurity.repository.CommentRepository;
import lab5.springsecurity.service.CommentService;
import lab5.springsecurity.util.ListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentRepository commentRepo;

    @Autowired
    ListMapper listMapper;

    @Autowired
    ListMapper<Comment, CommentDto> listMapperCommentToDto;


    @Override
    public List<CommentDto> findAll() {
        return (List<CommentDto>)listMapperCommentToDto.mapList(commentRepo.findAll(), new CommentDto());
    }

    @Override
    public void addComment(Comment c) {
        commentRepo.save(c);
    }
}
