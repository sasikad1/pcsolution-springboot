package com.ijse.coursework.security.jwt;

import java.security.Key;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Configuration
public class JwtUtills {
    @Value("${app.secret}")
    private String secret;

    private Key key() {
        return Keys.hmacShaKeyFor(Decoders.BASE64.decode(secret));
    }

    public String generateJwtToken(Authentication authentication) {
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();

        //Generate JWT token for the userDetails
        return Jwts.builder()
                .setSubject(userDetails.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(new Date().getTime() + 1000 * 60 * 60 * 24))
                .signWith(key(), SignatureAlgorithm.HS256)
                .compact();
    }

    public boolean validateJwtToken(String token) {
        try {
            Jwts.parserBuilder().setSigningKey(key()).build().parse(token);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public String getUsernameFromJwtToken(String token) {
        return Jwts.parserBuilder().setSigningKey(key()).build().parseClaimsJws(token).getBody().getSubject();
    }
}