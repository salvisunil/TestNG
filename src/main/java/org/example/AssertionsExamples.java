package org.example;

import net.bytebuddy.build.Plugin;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;


import java.util.concurrent.TimeUnit;

import static org.testng.TestRunner.PriorityWeight.priority;

public class AssertionsExamples {

    static WebDriver driver;
    @BeforeClass
   public static void start()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sunil.Salvi\\Downloads\\chromedriver.exe");
       driver =new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);


    }
    @Test
   public void logoTest()
    {
        WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));
        Assert.assertTrue(logo.isDisplayed());
       // driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
    }
    @Test
   public void homePageTitle(){
        String title = driver.getTitle();
        Assert.assertEquals("OrangeHRM",title);

    }
    @AfterClass
    void tearDown()
    {
        driver.quit();
    }
}
