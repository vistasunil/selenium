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
		driver.findElement(By.id("q")).sendKeys("DevOps");
		driver.findElement(By.className("ibm-search-link")).click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);		
		
		String firstData = driver.findElement(By.className("ibm--result-item__title")).getText();
		String CheckData = "DevOps – IBM Developer – IBM Developer";
		System.out.println(firstData);
		if(firstData.equals(CheckData)) {
			driver.findElement(By.className("ibm--result-item__title")).click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		}
		else {
			System.out.println("Item not found");
		}
		
		String actualData = driver.findElement(By.className("developer--card__title")).getText();
		String expectedData = "Use Tekton and OpenShift operators to automate application deployment";
		System.out.println(actualData);
		if(actualData.equals(expectedData)) {
			System.out.println("Found String!\n---------------");			
			String dateView = driver.findElement(By.className("ibmcode_upcomingevents")).getText();
			String timeView = driver.findElement(By.className("developer--card__location")).getText();
			System.out.println("Next Event is on: \n"+ dateView + "\n"+ timeView);
			System.out.println("---------------\nTest Successful");
			driver.close();	
		}
		else {
			System.out.println("Oops!! String Not Found.");
		}
	
	}
}
