package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {

    @Test(priority = 1)
        //priority means testng method run alphabetical
    void setup()
    {
        System.out.println("Opening the browser");

    }

    @Test(priority = 2)
    void searchCustomer()
    {
        System.out.println("This is search customer test");
        Assert.assertEquals(1,2);
    }
    @Test(priority = 3)
    void addCustomer()
    {
        System.out.println("This is add customer test");
    }


    @Test(priority = 4)
    void teardown()
    {
        System.out.println("closing browser");
    }

}
