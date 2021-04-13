package com.simple.springsecuritydemo.security;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;

@Getter
public class JwtAuthenticationException extends AuthenticationException {
    private HttpStatus httpsStatus;
    public JwtAuthenticationException(String msg) {
        super(msg);
    }

    public JwtAuthenticationException(String msg,
                                      HttpStatus httpsStatus) {
        super(msg);
        this.httpsStatus = httpsStatus;
    }
}
