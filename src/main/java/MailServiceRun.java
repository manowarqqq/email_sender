import testData.BodyData;
import testData.SubjectData;
import utils.PropertyReader;

import javax.mail.MessagingException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static testData.BodyData.getBodyData;
import static testData.SubjectData.getSubjectData;

public class MailServiceRun {



    public MailServiceRun() {
    }


    static List getAttachmentsPaths() {
        File file = new File("D:\\bigid\\QA\\prepared data\\test5");
        List<String> resultList = new ArrayList<>();
        File[] files = file.listFiles();
        assert files != null;
        for (int i = 0; i < files.length; i++) {
            resultList.add(files[i].getAbsolutePath());
        }
        return resultList;
    }

    public static void main(String[] args)  {
        Random rand =new Random();
        PropertyReader reader = new PropertyReader();
         String username = reader.getPropValues().getProperty("username");
        String password = reader.getPropValues().getProperty("password");
         String host = reader.getPropValues().getProperty("host");
         String port = reader.getPropValues().getProperty("port");

        MailService mailService = null;
        try {
            mailService = new MailService(username,password,host,port);
        } catch (IOException e) {
            e.printStackTrace();
        }
        mailService.getSession();
        try {
            for (int i=0;i<=5;i++)
            mailService.sendMail(mailService.getSession(), "victorb@bigidcom.onmicrosoft.com", getSubjectData().get(rand.nextInt(getSubjectData().size()-1)+1), getBodyData().get(rand.nextInt(getBodyData().size()-1)+1),getAttachmentsPaths(),rand.nextInt(getAttachmentsPaths().size()-1)+1);
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
