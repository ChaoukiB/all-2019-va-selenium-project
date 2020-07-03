package com;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class test {
    public WebDriver driver ;
    @Test
    public void test() throws MalformedURLException {
        URL url = new URL("http://192.168.1.66:4444/wd/hub");
        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.merge(dcap);
        driver = new RemoteWebDriver(url, chromeOptions);


    }

    public static void main(String[] args) {

      int num1 = 5;
      int num2 =10;

      int temp = num1;
      num1=num2;
      num2=temp;
        System.out.println(num1+"   "+num2);

    }
}
