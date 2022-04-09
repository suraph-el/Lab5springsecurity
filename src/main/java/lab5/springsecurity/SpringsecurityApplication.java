package lab5.springsecurity;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringsecurityApplication {

    public static void main(String[] args) {
        System.out.println("Start");
        SpringApplication.run(SpringsecurityApplication.class, args);
        System.out.println("End");
    }
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

}
