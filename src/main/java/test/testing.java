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
       options.addArguments("--start-maximized");    
       options.addArguments("--test-type");    
        options.addArguments("--ignore-certificate-errors");    
       options.addArguments("--disable-popup-blocking");    
       options.addArguments("--disable-default-apps");    
       options.addArguments("-disable-extensions-file-access-check");    
       options.addArguments("--no-sandbox");   
      options.addArguments("--disable-extensions-file-access-check");  
      options.addArguments("--disable-infobars");  
      options.addArguments("--disable-gpu");  
       options.addArguments("--incognito"); 
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
