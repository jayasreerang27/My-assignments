package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class SalesforceMarathon2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//Login
		
		driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
		
		driver.findElement(By.id("password")).sendKeys("Password#123");
		
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		
// Window Handling 		
		
        Set<String> set=driver.getWindowHandles();
        
        List<String> list=new ArrayList<String>(set);
        
        driver.switchTo().window(list.get(1));
        
        driver.findElement(By.xpath("//button[text()='Confirm']")).click();
        
// Move to Element -- Learning 
        
        Shadow shadow = new Shadow(driver);
        
        shadow.setImplicitWait(30);
        
        Actions action = new Actions(driver);
		
		shadow.findElementByXPath("//span[text() ='Learning']").click();
		
		WebElement learnTrail = shadow.findElementByXPath("//span[text() ='Learning on Trailhead']");
		
		action.moveToElement(learnTrail).perform();
        
        
        WebElement sales = shadow.findElementByXPath("//a[text()='Salesforce Certification']");
        
        driver.executeScript("arguments[0].click();", sales);
        
        driver.findElement(By.xpath("//div[@class ='roleMenu-item_text'][1]")).click();
        
        driver.findElement(By.xpath("(//img[@class='roleMenu-item_img']/following-sibling::div)[2]")).click();
        
        // find elements will be stored as web elements in a list and it needs to be converted to string .So need an empty list with string and then add that list to the string list using for each 
        
        String text = driver.findElement(By.xpath("//div[contains(text(), 'pride')]")).getText();
        
        System.out.println(text);
        
        
        
        
        
        
		
	        
	        
	}

}
