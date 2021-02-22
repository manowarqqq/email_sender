import utils.PropertyReader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class MailService {

    private String username = "";
    private String password = "";
    private String host = "";
    private String port = "";

    MailService() {
    }

    MailService(String username, String password, String host, String port) throws IOException {

        this.username = username;
        this.password = password;
        this.host = host;
        this.port = port;
    }

    public Session getSession() {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", this.host);
        props.put("mail.smtp.port", this.port);

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        return session;
    }

    private Message createMail(Session session, String emailTo, String emailSubject, String bodyText, List attachmentPaths, int attahmentsNumbers) throws AddressException, MessagingException, IOException {
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("mail@gmail.com"));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailTo));
        message.setSubject(emailSubject);

        BodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setText(bodyText);

        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);

        for (int i = 0; i < attahmentsNumbers; i++) {
            Random rand =new Random();
            MimeBodyPart attachmentPart = new MimeBodyPart();
            attachmentPart.attachFile(new File((String) attachmentPaths.get(rand.nextInt(attachmentPaths.size()-1)+1)));
            multipart.addBodyPart(attachmentPart);
        }
        message.setContent(multipart);

        return message;
    }

    public void sendMail(Session session,String EmailTo,String emailSubject, String bodyText, List attachmentPaths, int attahmentsNumbers) throws MessagingException, IOException {

        Message message = createMail(session,EmailTo,emailSubject, bodyText, attachmentPaths, attahmentsNumbers);
        Transport.send(message);
        System.out.println("Done");
    }

}