package com.epam.patterns;


import org.testng.annotations.AfterTest;

/**
 * Unit test for simple App.
 */
public class AppTest{


    @AfterTest
    public void tearDown(){
        System.out.println("end");
    }
}

