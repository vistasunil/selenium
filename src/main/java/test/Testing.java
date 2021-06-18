package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing{
   public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");	// <-- Change this path
       WebDriver driver = new ChromeDriver();
       String baseUrl = "http://104.154.106.116:82/devopsIQ/";
       String expectedTitle = "Jenkins Webhook Website";
       String actualTitle = "";
       driver.get(baseUrl);
       actualTitle = driver.getTitle();
       if (actualTitle.contentEquals(expectedTitle)){
           System.out.println("TEST PASSED!");
       } else {
           System.out.println("TEST FAILED");
       }
       driver.close();
   }
}
