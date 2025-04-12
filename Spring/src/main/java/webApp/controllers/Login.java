package webApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import webApp.services.AuthService;

@Controller
@SessionAttributes("name")
public class Login {
    private final AuthService authService;

    public Login(AuthService authService) {
        this.authService = authService;
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String goTologinPage() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String goToWelcomePage(@RequestParam String username, @RequestParam String password, ModelMap modelMap) {
        modelMap.put("username", username);
        modelMap.put("password", password);
        if (authService.authenticate(username, password)) {
            modelMap.put("name", username);
            return "welcome";
        }
        modelMap.put("ErrorMessage", "Invalid Credentials");
        return "login";
    }
}
