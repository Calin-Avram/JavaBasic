package oop.mostenire;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {
    @BeforeClass
    public void setUp(){
        System.out.println("Setup-ul din clasa BaseTest (Parinte)");
    }

    @BeforeMethod
    public void baseTest(){
        System.out.println("Executare BaseTest (Parinte)");
    }
}
