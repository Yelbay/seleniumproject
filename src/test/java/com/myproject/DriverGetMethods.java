package com.myproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverGetMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","./drivers.geckodriver");
        WebDriver driver=new FirefoxDriver();
        // 1- driver.get("url") --> goes to the url we wrote
        driver.get("https://www.amazon.com");

        // 2- driver.getTitle() --> returns the title of the page it is in
        System.out.println("page title :" +driver.getTitle());//Amazon.com. Spend less. Smile more.

        // 3- driver.getCurrentUrl() --> returns the URL of the page it is in
        System.out.println(driver.getCurrentUrl()); // https://www.amazon.com/

       // 4- driver.getPageSource(); // prints the page codes running in the background
        System.out.println("=====================================================");
        System.out.println(driver.getPageSource());//// prints the page codes running in the background
// 5- driver.getWindowHandle() --> returns the UNIQUE hash code of the page it is in
        System.out.println(driver.getWindowHandle()); // CDwindow-F4A35FD5413FE52C6DEB0B03CA6DFB9F
        // 6- driver.getWindowHandles()--> returns the all pages UNIQUE hash codes of the page it is in
    }
}
