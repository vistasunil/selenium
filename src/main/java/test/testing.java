package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testing{
   public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");	// <-- Change this path
       ChromeOptions options = new ChromeOptions();        
        //add the headless argument
       //options.addArguments("--headless", "--disable-gpu", "--dump-dom");        
       options.addArguments("disable-infobars");
       options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
       options.setExperimentalOption("useAutomationExtension", false);

        options.addArguments("--disable-gpu");
        options.addArguments("--disable-extensions");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        options.addArguments("--window-size=1580,1280");
       //options.addArguments("--headless", "window-size=1024,768", "--no-sandbox"); //("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors","--disable-extensions","--no-sandbox","--disable-dev-shm-usage");
       WebDriver driver = new ChromeDriver(options);        
       String baseUrl = "https://www.thecloudtrain.com/";
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
