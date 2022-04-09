package lab5.springsecurity.service;

import lab5.springsecurity.domain.dto.request.LoginRequest;
import lab5.springsecurity.domain.dto.request.RefreshTokenRequest;
import lab5.springsecurity.domain.dto.response.LoginResponse;

public interface AuthService {
    LoginResponse login(LoginRequest loginRequest);
    LoginResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}