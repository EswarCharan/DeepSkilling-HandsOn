package com.example.jwtauthdemo.Controller;

import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.security.Key;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private static final Logger logger = LoggerFactory.getLogger(AuthController.class);

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
        logger.info("Authentication started");
        logger.debug("Authorization header: {}", authHeader);

        String user = getUser(authHeader);
        String token = generateJwt(user);

        Map<String, String> map = new HashMap<>();
        map.put("token", token);

        logger.debug("User from auth header: {}", user);
        logger.info("Authentication ended");

        return map;
    }

    private String getUser(String authHeader) {
        logger.debug("getUser started");
        String encodedCredentials = authHeader.substring("Basic ".length());
        byte[] decodedBytes = Base64.getDecoder().decode(encodedCredentials);
        String decoded = new String(decodedBytes);
        logger.debug("Decoded credentials: {}", decoded);

        String username = decoded.split(":")[0];
        logger.debug("Extracted username: {}", username);

        logger.debug("getUser ended");
        return username;
    }

    private String generateJwt(String user) {
        logger.debug("Generating token for user: {}", user);

        // Your secret key should be at least 32 chars for HS256
        String secret = "mysecretkeymysecretkeymysecretkey12"; 

        Key key = Keys.hmacShaKeyFor(secret.getBytes());

        String token = Jwts.builder()
                .setSubject(user)
                .setIssuedAt(new Date())
                .setExpiration(new Date((new Date()).getTime() + 1200000)) // 20 minutes
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();

        logger.debug("Generated token: {}", token);

        return token;
    }
}
