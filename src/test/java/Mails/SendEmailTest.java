package Mails;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import org.testng.annotations.Test;

import java.util.Properties;

public class SendEmailTest {
   @Test
   public void sendEmail() {
        final String senderEmail = PasswordUtils.decodePassword("bXlqYXZhbWFpbDI3QGdtYWlsLmNvbQ==");
        final String appPassword = PasswordUtils.decodePassword("cWZjZXJhbnptcHNqdmJ2bg==");
        final String recipientEmail = PasswordUtils.decodePassword("YWRpdGlAdGFsZW50NTAwLmNv");
        final String emailSubject = "Please Stop Spam";
        final String emailBody = "Hello Aditi, \n\nThis is an automated email. I have emailed you several times to stop spamming me. Please stop your spam, else i will also spam you with my automated emails daily. \n\n Regards,\n Koi Nahi";

        Properties prop = new Properties();
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.port", "587");

        Session session = Session.getInstance(prop, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, appPassword);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
            message.setSubject(emailSubject);
            message.setText(emailBody);

            Transport.send(message);
            System.out.println("Email Sent Successfully ***");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}