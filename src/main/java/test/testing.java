package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testing{
   public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
       ChromeOptions options = new ChromeOptions();        
        //add the headless argument
       //options.setBinary("/opt/google/chrome/chrome");   
       //options.addArguments("window-size=1400,800");  
       //options.addArguments("headless");  
       //options.addArguments("--headless", "--dump-dom", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors","--disable-extensions","--no-sandbox","--disable-dev-shm-usage");
      	// <-- Change this path
       WebDriver driver = new ChromeDriver(options);        
       String baseUrl = "https://thecloudtrain.com/";
       String expectedTitle = "DevOps Workshop | Cloudtrain";
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
