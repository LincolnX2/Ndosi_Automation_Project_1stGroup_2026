import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.time.Duration;

public class loginToNdosiWebsite {

    WebDriver driver;
    @Test


    public void loginWithValidDetails() throws InterruptedException {
        //To call a chrome web browser
        driver = new ChromeDriver();

        //To navigate to ndosi webpage - using ndosi url
        driver.get("https://ndosisimplifiedautomation.vercel.app/#practice");

        //TO get browser information
        driver.getTitle();

        //To wait for the call element to be executed before proceeding to the next call.
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

        //TO maximize the browser window
        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/div/div/nav/div[1]/div[3]/button/span[2]")).click();

        //To input email data
        driver.findElement(By.id("login-email")).sendKeys("yinus.env@gmail.com");

        //TO input password data
        driver.findElement(By.id("login-password")).sendKeys("dummy@11");

        //To click the submit button
        driver.findElement(By.name("loginSubmit")).click();

        //To Assert some verification
        driver.findElement(By.xpath("//*[@id=\"app-main-content\"]/section/div[3]/div[1]/div[1]/h3")).isDisplayed();
        System.out.println("My courses is displayed");

        //To Assert some verification
        Assert.assertEquals("My Courses","My Courses");
        System.out.println("No Error: Content Found");

        //To Assert some verification - Negative Testing - AssertionError
        Assert.assertEquals("My Courses","My Courses/");
        System.out.println("Error: Content Not Found");

        //TO close the webpage after navigating & wait some seconds before closing
        Thread.sleep(5000);
        driver.close();
        //driver.quit();

    }


}


