package pariah.selenium.test.automation.utils.generators;

import pariah.selenium.test.automation.utils.BaseConfiguration;

import java.util.Date;

public class VersionDataGenerator {

    public Object[][] generateVersionData() {
        Object[][] data = new Object[BaseConfiguration.VERSION_DATA_SIZE][];

        for (int i = 0; i < BaseConfiguration.VERSION_DATA_SIZE; i++) {
            Object[] versionData = new Object[2];
            versionData[0] = new Date().getTime() + "_" + new BaseGenerator().generateString(6);
            versionData[1] = new BaseGenerator().generateString(
                    new BaseGenerator().generateNumber(200, 255));
            data[i] = versionData;
        }
        return data;
    }
}