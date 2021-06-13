package test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();        
        //add the headless argument
        options.addArguments("headless");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.ibm.com");
		driver.manage().window().maximize();		
		driver.findElement(By.id("q")).sendKeys("Introduction to DevOps Capabilities");
		driver.findElement(By.className("ibm-search-link")).click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);		
		
		String firstData = driver.findElement(By.className("ibm--result-item__title")).getText();
		String CheckData = "Introduction to DevOps Capabilities";
		if(firstData.equals(CheckData)) {
			driver.findElement(By.className("ibm--result-item__title")).click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		}
		else {
			System.out.println("Course not found");
		}
	    
		driver.findElement(By.className("bx--btn--secondary")).click();
		String actualData = driver.findElement(By.className("pl-header-subtitle")).getText();
		String expectedData = "Course code: C120019G";
		
		if(actualData.equals(expectedData)) {
			System.out.println("Found Course!");			
			String dateView = driver.findElement(By.className("course-card-icons")).getText();
			System.out.println("Course Details: \n"+ dateView + "\n"); 
			System.out.println("Test Successful");
			driver.close();	
		}
		else {
			System.out.println("Oops!! String Not Found.");
		}		
	}
}
