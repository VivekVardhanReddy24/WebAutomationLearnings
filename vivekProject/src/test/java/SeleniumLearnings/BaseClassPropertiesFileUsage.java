package SeleniumLearnings;

import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import org.junit.Test;

import java.io.IOException;

public class BaseClassPropertiesFileUsage {
    @Test
    public void navigate() throws IOException {
        OpenBrowser.navToWebsite(ReadPropertiesFile.propFile("GGRegPageUrl"));
        OpenBrowser.closeBrowser();


    }

}
