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
      options.add_argument("--user-data-dir=/home/ubuntu") #Path to your chrome user-data/profile
options.add_argument('--disable-infobars') #disable the automation prompt bar
options.add_argument('--lang=en') #Set language to English
       options.addArguments("--headless", "--dump-dom", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors","--disable-extensions","--no-sandbox","--disable-dev-shm-usage");
       WebDriver driver = new ChromeDriver(options);        
       String baseUrl = "https://thecloudtrain.com/";
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
