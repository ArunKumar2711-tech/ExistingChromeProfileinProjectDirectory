package pack1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestSetup {
	@Test
    public  void open() {
        // Automatically manage ChromeDriver binaries
        WebDriverManager.chromedriver().setup();

        // Set up ChromeOptions to use the profile
        ChromeOptions options = new ChromeOptions();
       // options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        String userDataDir = System.getProperty("user.dir")+"\\User Data";
        options.addArguments("user-data-dir=" + userDataDir);
       options.addArguments("profile-directory=Profile 7");   
        
        
        WebDriver driver = new ChromeDriver(options);
      //  driver.get("http://www.gmail.com");
      //  System.out.println("Title after Google: " + driver.getTitle());
       driver.get("https://google.com");
        driver.get("https://rappit-gitlab.vanenburg.com/");
        System.out.println("Title after GitLab: " + driver.getTitle());
        System.out.println("Test Passed");
        System.out.println("You cracked I think");

        // Your test code here

        driver.quit();
    }
}
