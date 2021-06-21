package pariah.selenium.test.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FirstTest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Desktop\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://google.pl");


    }

    /*
        @Test
        public void firstTestMethod() {
            // assert -> metoda do sprawdzania czegos
            // assert(true)
            // assertEquals(x,y)


            int x = 5;
            int y = 3;

            Assert.assertEquals(x + y, 8);

        }

        @Test
        public void secondTestMethod() {

            int x = 5;
            int y = 3;
            Assert.assertEquals(x + y, 9);
        }

        @Test
        public void thirdTestMethod() {


            Assert.assertEquals("Google", driver.getTitle());

            // driver.navigate().back(); cofanie w przegladarce przyciski
            // driver.navigate().forward();

        }




    @Test
    public void forthTestMethod() {
        driver.findElement(By.id("L2AGLb")).click();

        Assert.assertEquals("Google", driver.getTitle());


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

    }

    */
    @Test
    public void fifthTestMethod() {
        driver.findElement(By.id("L2AGLb")).click();
        Assert.assertEquals("Google", driver.getTitle());

        driver.findElement(By.name("q")).sendKeys("testerzy.pl");
        driver.findElement(By.name("q")).click();
        driver.findElement(By.xpath("//html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/center/input[2]")).click();
        Assert.assertEquals("testerzy.pl - Lepsza jakość testowania", driver.getTitle());


    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }


}

