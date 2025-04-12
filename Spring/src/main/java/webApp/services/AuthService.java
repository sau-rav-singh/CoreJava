package webApp.services;

import org.springframework.stereotype.Service;

@Service
public class AuthService {
    public boolean authenticate(String username, String password) {
        boolean isValidUserName = username.equals("admin");
        boolean isValidPassword = password.equals("admin");
        return isValidUserName && isValidPassword;
    }
}
