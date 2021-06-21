package pariah.selenium.test.automation.utils.files;

import java.io.File;
import java.net.URISyntaxException;
import java.nio.file.Paths;

public class FileHelper {

    public  String getResourceFilePath(String resourcePath) {

        try {
            return new File(getClass().getClassLoader().getResource(resourcePath).getFile()).getAbsolutePath();
        } catch (NullPointerException e) {
            e.printStackTrace();
            return null;
        }


    }


}



