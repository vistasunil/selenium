package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testing{
   public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");	// <-- Change this path
       ChromeOptions options = new ChromeOptions();        
        //add the headless argument
       options.addArguments("--no-sandbox");    
       options.addArguments("--no-sandbox");    
       options.addArguments("--no-sandbox");    
        options.addArguments("--no-sandbox");    
       options.addArguments("--no-sandbox");    
       options.addArguments("--no-sandbox");    
       options.addArguments("--no-sandbox");    
       options.addArguments("--no-sandbox");    
      --start-maximized;--test-type;--no-sandbox;--ignore-certificate-errors;
                   --disable-popup-blocking;--disable-default-apps;--disable-extensions-file-access-check;
                   --incognito;--disable-infobars,--disable-gpu
       options.addArguments("--disable-dev-shm-usage");
       options.addArguments("--headless");        
       options.setExperimentalOption("useAutomationExtension", false);
        //pass the options parameter in the Chrome driver declaration
       WebDriver driver = new ChromeDriver(options);        
       String baseUrl = "http://34.136.113.45:82/devopsIQ";
       String expectedTitle = "Jenkins Webhook Website";
       String actualTitle = "";
       driver.get(baseUrl);
       actualTitle = driver.getTitle();
       if (actualTitle.contentEquals(expectedTitle)){
           System.out.println("Website Title Expected: "+ expectedTitle);
           System.out.println("Website Title Actual: "+ actualTitle);
           System.out.println("TEST PASSED!");
       } else {
           System.out.println("Website Title Expected: "+ expectedTitle);
           System.out.println("Website Title Actual: "+ actualTitle);
           System.out.println("TEST FAILED");
       }
       driver.close();
   }
}
