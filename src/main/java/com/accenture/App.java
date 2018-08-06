package com.accenture;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {
	
	WebDriver driver;
	
	public App() {
		
		//Create prefs map to store all preferences 
		Map<String, Object> prefs = new HashMap<String, Object>();

		//Put this into prefs map to switch off browser notification
		prefs.put("profile.default_content_setting_values.notifications", 2);

		//Create chrome options to set this prefs
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);		

		//Now do your further steps		
		System.setProperty("webDriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver(options);
	}

	public static void main(String[] args) throws InterruptedException{
		
		new App().mensajeAFb();
		
		
		
	}
	
	public void mensajeEnGmail() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/gmail");
		
		WebElement click;
		click = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		click.sendKeys("ameza@colombocartagena.com\n");
		
		Thread.sleep(1000);
		click = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
		click.sendKeys("masterkool\n");
		
		Thread.sleep(1000);
		click = driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']"));
		click.click();
		
		Thread.sleep(1000);
		click = driver.switchTo().activeElement();
		click.sendKeys("jesus.barajas@accenture.com ");
		
		Thread.sleep(1000);
		click = driver.switchTo().activeElement();
		click.sendKeys("\tTrin \t");
		
		Thread.sleep(1000);
		click = driver.switchTo().activeElement();
		click.sendKeys("Gg izi, Accenture en bici");		
				
		Thread.sleep(1000);
		click = driver.findElement(By.xpath("/html[1]/body[1]/div[16]/div[1]/div[1]"
				+ "/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/"
				+ "div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]"
				+ "/tr[2]/td[1]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]"));
		click.click();	
		
		//driver.quit();		
	}
	
	public void mensajeAFb() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		try {
			WebElement click;
			click = driver.switchTo().activeElement();
			click.sendKeys("masterkool04@hotmail.com");
			click.sendKeys("\t"+Main.pass+"\n");
			
			Thread.sleep(1000);			
			click = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]"
					+ "/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[2]"));
			click.sendKeys("Fernando Castilla \n");
			
			Thread.sleep(1000);
			click = driver.findElement(By.cssSelector("div._52eh._5bcu"));
			click.click();
			
			Thread.sleep(1000);
			click = driver.findElement(By.cssSelector("a._42ft._4jy0._4jy4._517h._51sy"));
			click.click();
			
			Thread.sleep(1000);
			click = driver.switchTo().activeElement();
			click.sendKeys("Gg izi, desde Accenture enviando un mensaje con Selenium en bici :v");
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			//driver.quit();
		}
		
		
		
		
		
		
	}

}
