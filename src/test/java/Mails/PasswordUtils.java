package Mails;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class PasswordUtils {

    static String decodePassword(String encodedPassword) {
        byte[] decodedBytes = Base64.getDecoder().decode(encodedPassword);
        return new String(decodedBytes, StandardCharsets.UTF_8);
    }

    private static String encodePassword(String password){
        byte[] encodedBytes = Base64.getEncoder().encode(password.getBytes());
        return new String(encodedBytes);
    }

    public static void main(String[] args) {
        String password = "";
        String hashedPassword = encodePassword(password);
        System.out.println("Hashed Password: " + hashedPassword);
        String unhashedPassword = decodePassword(hashedPassword);
        boolean isPasswordValid = unhashedPassword.equals(password);
        System.out.println("Password is valid: " + isPasswordValid);
       // System.out.println(decodePassword(""));
    }}