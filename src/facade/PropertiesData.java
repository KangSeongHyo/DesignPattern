package facade;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesData {

    public String getData(int ...keyArray){
        Properties properties = new Properties();
        StringBuilder sb = new StringBuilder();

        try {
            properties.load(new FileReader("resources/facade/store.properties"));
            for (int key:keyArray) {
                sb.append(properties.getProperty(String.valueOf(key))).append(" ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

}
