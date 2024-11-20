package com.example.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

public class BasePage {

    protected void setValue (SelenideElement element , String value){
        element.setValue(value).pressTab();
    }

    protected void click (SelenideElement element){
        element.should(Condition.visible).should(Condition.enabled).click();

    }
    protected void checkText(SelenideElement element, String text ){
        Assert.assertTrue((element).getText().contains(text));
    }



}
