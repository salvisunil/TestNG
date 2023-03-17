package org.example;

import org.testng.annotations.Test;

public class FirstTestCase {

    @Test(priority = 1)
        //priority means testng method run alphabetical
    void setup()
    {
        System.out.println("Opening the browser");
    }

    @Test(priority = 2)
    void Login()
    {
        System.out.println("This is login test");
    }

    @Test(priority = 3)
    void teardown()
    {
        System.out.println("closing browser");
    }

}
