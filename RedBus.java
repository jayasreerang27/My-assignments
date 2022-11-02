package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class RedBus {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//Login
		
		WebElement from = driver.findElement(By.id("src"));
		from.sendKeys("Chennai");
		//When this does not work add another line for list n click
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		
		
	
		WebElement to = driver.findElement(By.id("dest"));
		to.sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		
		
		WebElement date = driver.findElement(By.xpath("//input[@id = 'onward_cal']"));
		date.click();
		driver.findElement(By.xpath("//table//td[text()='3']")).click();
		driver.findElement(By.id("search_btn")).click();
		
		//String text = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		        
		//System.out.println(text);
		
		//Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//input[@id='bt_SLEEPER']")).click();
		
		String text2 = driver.findElement(By.xpath("(//div[@class ='travels lh-24 f-bold d-color')[2]]")).getText();
		
		System.out.println(text2);
		
		driver.findElement(By.xpath("(//div[text()='View Seats'])[2]")).click();
		
		
		
		
		
		
		
		
        
        
		
	        
	        
	}

}
