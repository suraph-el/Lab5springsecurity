package lab5.springsecurity.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.logging.Logger;
public interface LoggerRepo extends CrudRepository<Logger, Long> {

}
