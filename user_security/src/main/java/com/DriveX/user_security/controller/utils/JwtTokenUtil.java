package com.DriveX.user_security.controller.utils;



import com.DriveX.user_security.dao.entity.Role;
import com.DriveX.user_security.dao.entity.User;
import io.jsonwebtoken.*;

import java.util.Date;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class JwtTokenUtil {

    private static final String jwtSecret = "NDQ1ZjAzNjQtMzViZi00MDRjLTljZjQtNjNjYWIyZTU5ZDYw";
    private static final String jwtIssuer = "ITAcademy";

    public static String generateAccessToken(User user) {
        return generateAccessToken(user.getUsername(), user.getAuthorities());
    }

    public static String generateAccessToken(String name, Set<Role> role) {
        String roleStr = role.stream()
                .map(s -> s.getAuthority())
                .collect(Collectors.joining(", "));
        return Jwts.builder()
                .setSubject(name)
                .claim("role", roleStr)
                .setIssuer(jwtIssuer)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + TimeUnit.DAYS.toMillis(7))) // 1 week
                .signWith(SignatureAlgorithm.HS512, jwtSecret)
                .compact();
    }


    public static String getUsername(String token) {
        Claims claims = Jwts.parser()
                .setSigningKey(jwtSecret)
                .parseClaimsJws(token)
                .getBody();

        return claims.getSubject();
    }

    public static Date getExpirationDate(String token) {
        Claims claims = Jwts.parser()
                .setSigningKey(jwtSecret)
                .parseClaimsJws(token)
                .getBody();

        return claims.getExpiration();
    }

    public static boolean validate(String token) {
        try {
            Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token);
            return true;
        } catch (SignatureException ex) {
            //logger.error("Invalid JWT signature - {}", ex.getMessage());
        } catch (MalformedJwtException ex) {
            //logger.error("Invalid JWT token - {}", ex.getMessage());
        } catch (ExpiredJwtException ex) {
            //logger.error("Expired JWT token - {}", ex.getMessage());
        } catch (UnsupportedJwtException ex) {
            //logger.error("Unsupported JWT token - {}", ex.getMessage());
        } catch (IllegalArgumentException ex) {
            //logger.error("JWT claims string is empty - {}", ex.getMessage());
        }
        return false;
    }
}
