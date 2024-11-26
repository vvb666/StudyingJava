package com.example.test;

import com.example.page.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class SimpleTest extends BaseSimpleTest {
    private MainPage Page = new MainPage();

    private String email = "feivinks@mail.com";
    private String text =  "Welcome to GitHub!";





    @Test
    public void test (){
        open("");
        Page.setEmail(email);
        Page.ckickSignup();
        Page.checkTextContains(text);


    }
}
