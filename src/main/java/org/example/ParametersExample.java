package org.example;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class ParametersExample {

    static WebDriver driver;
    @BeforeClass
    @Parameters({"browser","url"})
    public static void start(String browser, String app)
    {
        if(browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Sunil.Salvi\\Downloads\\chromedriver.exe");
            driver =new ChromeDriver();
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        }
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


    }
    @Test
    public void logoTest()
    {
        WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));
        Assert.assertTrue("Logo is not matched", logo.isDisplayed());
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
    }
    @Test
    public void homePageTitle(){
        String title = driver.getTitle();
        Assert.assertEquals("OrangeHRM",title,"Title is not matched");

    }
    @AfterClass
    void tearDown()
    {
        driver.quit();
    }

}
