package com.mytestng.sample;

import org.testng.annotations.Test;

public class Priority_EnabledTest {
    @Test(priority=1)
    public void registerUser(){
        System.out.println("User Registration");
    }
    @Test(priority=2,enabled=false)
    public void ValidLoginCredentials(){
        System.out.println(" valid login cred ");
    }
    @Test(priority=3)
    public void Homepage(){
        System.out.println("Home page visibility");
    }
    @Test(priority=4)
    public void AddBeneficiary(){
        System.out.println("Adding beneficiary");
    }
}
