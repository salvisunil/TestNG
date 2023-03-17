package org.example;

import org.testng.annotations.*;

public class TC2 {
    @BeforeClass
    void beforeClass()
    {
        System.out.println("This will execute before every class");
    }
    @AfterClass
    void afterClass()
    {
        System.out.println("This will execute after every class");
    }
    @BeforeMethod
    void beforeMethod()
    {
        System.out.println("This will execute before every Method");
    }
    @AfterMethod
    void afterMethod()
    {
        System.out.println("This will execute after every method");
    }

    @Test
    void Test3()
    {
        System.out.println("Test is test1...");
    }
    @Test
    void Test4()
    {
        System.out.println("This is test2..");
    }
    @BeforeSuite
    void beforeSuite()
    {
        System.out.println("This will execute before the test Suite");
    }
    @AfterSuite
    void afterSuite()
    {
        System.out.println("This will execute after the test Suite");
    }

}
