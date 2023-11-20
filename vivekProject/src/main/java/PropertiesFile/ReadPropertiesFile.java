package PropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
    public static String propFile(String PropName) throws IOException{
        FileInputStream inputStream = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\PropertiesFile\\ReadPropertiesFile.properties");
        Properties property = new Properties();
        property.load(inputStream);
        return property.getProperty(PropName);
    }
}
