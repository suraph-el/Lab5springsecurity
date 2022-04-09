package lab5.springsecurity.service.serviceImpl;

import lab5.springsecurity.domain.Logger;
import lab5.springsecurity.repository.LoggerRepo;
import lab5.springsecurity.service.LoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoggerServiceImpl implements LoggerService {
    @Autowired
    LoggerRepo loggerRepo;


//    @Override
//    public void addLog(Logger logger) {
//        loggerRepo.save(logger);
//    }
}
