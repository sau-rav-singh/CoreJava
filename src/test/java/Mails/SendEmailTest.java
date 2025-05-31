package Mails;

import org.testng.annotations.Test;
import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;

import java.io.File;
import java.util.List;
import java.util.Properties;
import java.util.Random;

public class SendEmailTest {
    @Test
    public void SendTest() {
        final String senderEmail = PasswordUtils.decodePassword("bXlqYXZhbWFpbDI3QGdtYWlsLmNvbQ==");
        final String appPassword = PasswordUtils.decodePassword("dGZkaiBva25xIG9sZWcgaHBpaA==");
        final String recipientEmail = PasswordUtils.decodePassword("YWRpdGlAdGFsZW50NTAwLmNv");
        final String baseEmailSubject = "Please Stop Spam";
        List<String> emailBodies = List.of(
                "Hello Aditi,\n\nThis is an automated email. Please stop spamming me.\n\nRegards,\nKoi Nahi",
                "Hi Aditi,\n\nI kindly request you to stop sending spam emails. Thank you.\n\nRegards,\nKoi Nahi",
                "Dear Aditi,\n\nThis is a reminder to stop spamming. Please take action.\n\nRegards,\nKoi Nahi",
                "Hello Aditi,\n\nYour spam emails are overwhelming. Please stop.\n\nRegards,\nKoi Nahi",
                "Hi Aditi,\n\nThis is another attempt to ask you to stop spamming me.\n\nRegards,\nSaurav"
        );
        String emailBody = emailBodies.get(new Random().nextInt(emailBodies.size()));

        // Generate a random number (0-9999) and a random alphabet character (A-Z)
        Random random = new Random();
        int randomNumber = random.nextInt(10000); // Adjust range as needed
        char randomChar = (char) ('A' + random.nextInt(26));
        String emailSubject = baseEmailSubject + " " + randomNumber + randomChar;

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
            MimeBodyPart textBodyPart = new MimeBodyPart();
            textBodyPart.setText(emailBody);
            MimeBodyPart attachmentBodyPart = new MimeBodyPart();
            attachmentBodyPart.attachFile(new File("src/test/java/Mails/attachment.tar"));
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(textBodyPart);
            multipart.addBodyPart(attachmentBodyPart);
            message.setContent(multipart);
            Transport.send(message);
            System.out.println("Email Sent Successfully with Attachment ***");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}