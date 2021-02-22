package utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

public class PropertyReader {

    String result = "";
    InputStream inputStream;

    public Properties getPropValues()  {
        Properties prop = new Properties();
        try {
            String propFileName = "creds.properties";

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }


            String username= prop.getProperty("usernamme");
            String password = prop.getProperty("password");
            String host = prop.getProperty("host");
            String port = prop.getProperty("port");

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            assert inputStream != null;
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return prop;
    }
}
