package test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandaloneTest {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("www.rahulshettyacademy.com/client/");
		driver.findElement(By.id("userEmail")).sendKeys("mohanmarkande5@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Mohan@123");
		driver.findElement(By.id("login")).click();
	
		
		

	
	}

}

