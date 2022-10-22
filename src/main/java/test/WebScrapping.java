package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebScrapping {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://bing.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("DevOps");
		driver.findElement(By.id("search_icon")).click();
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
		
		String firstData = driver.findElement(By.className("b_algo")).getText();
		String CheckData = "What is DevOps? DevOps Explained | Microsoft Azure";
		System.out.println(firstData);
		String[] arrOfStr = firstData.split("\n",0);
		System.out.println(arrOfStr[0]);	

		if(arrOfStr[0].equals(CheckData)) {
			driver.findElement(By.className("b_title")).click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		}
		else {
			System.out.println("Item not found");
		}

		String items = driver.findElement(By.id("global-subnav")).getText();
		System.out.println(items);

	}

}
