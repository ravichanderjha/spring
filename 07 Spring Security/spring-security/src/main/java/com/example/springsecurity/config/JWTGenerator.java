package com.example.springsecurity.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JWTGenerator {
    public String generateToken(Authentication authentication){
        String username = authentication.getName();
        Date currentdate = new Date();
        Date expirydate = new Date(currentdate.getTime() + 18000);

        String token = Jwts.builder()
                .setSubject(username)
                .setIssuedAt(currentdate)
                .setExpiration(expirydate)
                .signWith(SignatureAlgorithm.HS512, "mysecret")
                .compact();
        return token;
    }
    public String getUsernameFromJWT(String token){
        Claims claims = Jwts.parser()
                .setSigningKey("mysecret")
                .parseClaimsJws(token)
                .getBody();
        return claims.getSubject();
    }

    public boolean validate(String token){
        try{
            Jwts.parser()
                    .setSigningKey("mysecret")
                    .parseClaimsJws(token);
            return true;
        }catch (Exception e){
            throw new AuthenticationCredentialsNotFoundException("JWT token expired or incorrect!");
        }
    }
}
