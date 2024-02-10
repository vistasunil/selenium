package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;


public class Webscrapping {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sushi/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("L2AGLb")).click();
		
		driver.findElement(By.name("q")).sendKeys("devops",Keys.ENTER);
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		WebElement firstData = driver.findElement(By.xpath("//h3[contains(text() ,'Azure DevOps Services')]"));

		firstData.click();
		
		System.out.println(firstData); 
		
		
		String practices = driver.findElement(By.id("overview")).getText();
		System.out.println("DevOps Practices:\n"+practices); 
		

	}

}
