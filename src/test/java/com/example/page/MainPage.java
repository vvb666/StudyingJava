package com.example.page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class MainPage  extends BasePage{
    private final SelenideElement emailInput =  $x("//input[@id='hero_user_email']");
    private final SelenideElement signBtn =  $x("//span[text()='Sign up for GitHub']/ancestor::button");
    private final SelenideElement signUp = $x("//h1");

    public void setEmail (String email){
     setValue(emailInput, email);

    }
    public void ckickSignup(){
        click(signBtn);
    }
    public void checkTextContains(String text){
        checkText (signUp,text);
    }


}
