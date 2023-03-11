import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebStart {
    WebDriver  wd;

    @BeforeClass
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        wd = new ChromeDriver(options);

        wd.get("https://trello.com/");
    }
    @Test
    public void start1(){

        wd.navigate().to("https://trello.com/");
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();


        wd.close();
        wd.quit();

    }

}