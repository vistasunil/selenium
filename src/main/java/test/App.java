package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class App {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ibm.com");
		driver.manage().window().maximize();

		driver.findElement(By.id("q")).sendKeys("DevOps");
		driver.findElement(By.className("ibm-search-link")).click();
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);

		String firstData = driver.findElement(By.className("ibm--result-item__title")).getText();
		String CheckData = "DevOps – IBM Developer – IBM Developer";
		System.out.println(firstData);
		
		if(firstData.equals(CheckData)) {
			driver.findElement(By.className("ibm--result-item__title")).click();
			driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
		}
		else {
			System.out.println("Item not found");
		}
		
		String actualData = driver.findElement(By.className("developerCardTitle")).getText();
		String expectedData = "What is DevSecOps and why is it so important?";
		System.out.println(actualData);
		if(actualData.equals(expectedData)) {
			System.out.println("Found String!\n---------------");			
			String solutions = driver.findElement(By.className("bx--accordion--md")).getText();
			String trending = driver.findElement(By.id("trending__panel")).getText();
			System.out.println("Featured solutions: \n"+ solutions + "\n Trending:\n---------------\n" + "\n"+ trending);
			System.out.println("---------------\nTest Successful");
			//driver.close();	
		}
		else {
			System.out.println("Oops!! String Not Found.");
		}


	}

}
