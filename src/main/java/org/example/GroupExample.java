package org.example;


import org.testng.annotations.Test;

//group testcase like sanity functional, regression, unit
public class GroupExample {
    @Test(groups = {"sanity"})
    void  Test1()
    {
        System.out.println("This is test1..");
    }
    @Test(groups = {"sanity"})
    void  Test2()
    {
        System.out.println("This is test2..");
    }
    @Test(groups = {"regression"})
    void  Test3()
    {
        System.out.println("This is test3..");
    }
    @Test(groups = {"regression"})
    void  Test4()
    {
        System.out.println("This is test4..");
    }
    @Test(groups = {"sanity","regression"})
    void  Test5()
    {
        System.out.println("This is test5..");
    }
}
