package com.epam.patterns;


import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest{

    @Test
    public void appTest(){
    }


    @AfterTest
    public void tearDown(){
        System.out.println("end");
    }
}

