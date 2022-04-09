package lab5.springsecurity.repository;

import lab5.springsecurity.domain.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PostRepo extends CrudRepository<Post, Integer> {
    List<Post> findAll();
}