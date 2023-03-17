package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

//Dependency in testng
//always run properties
public class DependencyExample {
    @Test
    void startCar() {
        System.out.println("Car started");
        Assert.fail();
    }

    @Test(dependsOnMethods = {"startCar"})
    void driveCar()
    {
        System.out.println("Car Driving");
    }

    @Test(dependsOnMethods = {"driveCar"})
    void stopCar()
    {
        System.out.println("Car stopped");
    }

    @Test(dependsOnMethods = {"driveCar", "stopCar"}, alwaysRun = true)
    void parkCar()
    {
        System.out.println("Car parked");
    }


}
