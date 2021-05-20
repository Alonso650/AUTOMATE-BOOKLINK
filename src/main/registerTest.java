package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.Assert;

public class registerTest {

	public void navigateToRegister() throws Exception{
		String baseUrl = "https://shrouded-plateau-90984.herokuapp.com/";
		String expectedTitle = "BookLink";
		String actualTitle = "";
		String textExpected = "";
		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("View All Book Entries")).isDisplayed();
		
		actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.findElement(By.linkText("View All Book Entries")).click();
		driver.findElement(By.id("register")).isDisplayed();
		
		textExpected = "Please Register".toLowerCase();
		driver.findElement(By.id("register")).click();
		String registerTitle = driver.findElement(By.cssSelector(".h3")).getText().toLowerCase();
		Assert.assertEquals(textExpected, registerTitle);
		
		driver.close();
	}
	
	public void registerValid() throws Exception{
		String baseUrl = "https://shrouded-plateau-90984.herokuapp.com/";
		String expectedTitle = "BookLink";
		String actualTitle = "";
		String textExpected = "";
		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("View All Book Entries")).isDisplayed();

		actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
		
		driver.findElement(By.linkText("View All Book Entries")).click();
		driver.findElement(By.id("register")).isDisplayed();
		
		driver.findElement(By.id("register")).click();
		
		driver.findElement(By.id("inputUsername")).sendKeys("Test");
		driver.findElement(By.id("inputPassword")).sendKeys("password");
		driver.findElement(By.id("inputFirstName")).sendKeys("Test");
		driver.findElement(By.id("inputLastName")).sendKeys("Testing");
		driver.findElement(By.id("inputEmail")).sendKeys("testinground4@gmail.com");
		
		

		
	}
}
