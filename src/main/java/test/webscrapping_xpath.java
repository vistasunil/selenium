package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;


public class App {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sushi/Downloads/chromedriver_mac64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("L2AGLb")).click();
		driver.findElement(By.name("q")).sendKeys("devops",Keys.ENTER);
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		String firstData = driver.findElement(By.className("yuRUbf")).getText();
		
		String[] arrOfStr=firstData.split("\n");
		System.out.println(arrOfStr[0]);
		
		String CheckData = "What is DevOps? - Amazon Web Services (AWS)";
		System.out.println(firstData);
		
		if(arrOfStr[0].equals(CheckData)) {
			driver.findElement(By.className("yuRUbf")).click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		}
		else {
			System.out.println("Item not found");
		}
		
		driver.findElement(By.xpath("//span[text()='Accept all cookies']")).click();

		String practices = driver.findElement(By.xpath("(//div[@class=\"aws-text-box\"])[10]")).getText();
		System.out.println("DevOps Practices:\n"+practices);

	}

}
