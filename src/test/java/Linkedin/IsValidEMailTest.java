package Linkedin;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsValidEMailTest {

    @Test
    public void emailTest() {
        Assert.assertTrue(isValidEmail("abc@xyz.com"));
        Assert.assertFalse(isValidEmail("abc@xyzcom"));
    }

    public boolean isValidEmail(String email) {
        String regex =  "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
