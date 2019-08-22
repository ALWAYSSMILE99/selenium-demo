package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class invoke_browser {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sgudala\\Desktop\\module4\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		//driver.navigate().to("https://www.google.com");
//		
	String title=driver.getTitle();
//		
//		System.out.println(title);
//		
//		
		//driver.findElement(By.id("q")).click();
		//driver.get("https://www.google.com");
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
//		driver.findElement(By.linkText("Register")).click();
//		driver.findElement(By.id("gender-male")).click();
//		driver.findElement(By.name("FirstName")).sendKeys("sudheer");
//		driver.findElement(By.name("LastName")).sendKeys("Gudala");
//		driver.findElement(By.name("Email")).sendKeys("Gudala@jer.com");
//		driver.findElement(By.name("Password")).sendKeys("Gudala@jk.com");
//		driver.findElement(By.name("ConfirmPassword")).sendKeys("Gudala@jk.com");
//		driver.findElement(By.id("register-button")).click();
//		driver.findElement(By.linkText("Log out")).click();
//		driver.findElement(By.linkText("Log in")).click();
//		driver.findElement(By.name("Email")).sendKeys("Gudala@jer.com");
//		driver.findElement(By.name("Password")).sendKeys("Gudala@jk.com");
//		driver.findElement(By.xpath("//input[@value='Log in']")).click();
//		
//		driver.manage().window().maximize();
//		driver.manage().window().setPosition(new Point(-2000,0));		
//		driver.manage().window().fullscreen();
//		driver.manage().window().getSize().getHeight();
		
		driver.findElement(By.linkText("Log in")).click();
		
	}

}
