package com.myproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumfirstclass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());
        driver.navigate().to("https://www.facebook.com");
        driver.navigate().back();

    }
}
