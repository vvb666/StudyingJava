package com.example.test;



import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseSimpleTest {

    @BeforeTest
    public void setupe (){
        Configuration.browser = "chrome";
        Configuration.browserSize = "1024x1080";
        Configuration.timeout = 20000; // ожидания элемента
        Configuration.pageLoadTimeout = 60000; // загрузка страницы
        Configuration.baseUrl ="https://github.com/";

    }

    @AfterTest
    public void closeDriver(){
        WebDriver driver = WebDriverRunner.getWebDriver();
        if (driver != null) {
            try {
                // Устанавливаем таймаут в 5 секунд (5000 миллисекунд)
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
        }
    }
}
