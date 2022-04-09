package lab5.springsecurity.domain.dto;

import lombok.Data;

@Data
public class UserDto {
    private int id;
    private String email;
    private String password;
    private String firstname;
    private String lastname;
}