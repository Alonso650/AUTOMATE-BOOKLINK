package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.Assert;

public class testMain {

	public void LandingPageTest() throws Exception{
		String baseUrl = "https://shrouded-plateau-90984.herokuapp.com/";
		String expectedTitle = "BookLink";
		String actualTitle = "";
		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(baseUrl);
		driver.manage().window().maximize();
		actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		driver.close();
	}
	
	
	public void MainPageNavigateTest() throws Exception{
		String baseUrl = "https://shrouded-plateau-90984.herokuapp.com/";
		String expectedTitle = "BookLink";
		String actualTitle = "";
		String textExpected = "";
		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(baseUrl);
		driver.manage().window().maximize();
		actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		textExpected = "Welcome to BookLink".toLowerCase();
		driver.findElement(By.linkText("View All Book Entries")).isDisplayed();
		driver.findElement(By.linkText("View All Book Entries")).click();
		String title = driver.findElement(By.cssSelector(".row:nth-child(1)")).getText().toLowerCase();
		
		Assert.assertEquals(title, textExpected);
		
		driver.close();
	}
}
