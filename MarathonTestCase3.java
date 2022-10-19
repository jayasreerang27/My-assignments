import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MarathonTestCase3 {

	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://login.salesforce.com");
 
		driver.manage().window().maximize();
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
	  //enter password
	    driver.findElement(By.id("password")).sendKeys("Password#123");
	    
	    //Login 
	    driver.findElement(By.id("Login")).click();
	    
	    driver.findElement(By.className("slds-icon-waffle")).click();
	    
	    driver.findElement(By.xpath("//button[text()='View All']")).click();
	    
	    driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("task");
	    
	   driver.findElement(By.xpath("//div[@class='slds-context-bar__label-action slds-p-left--none']//a")).click();
	   
	   driver.findElement(By.xpath("//span[text()='New Task']")).click();
	    
	    driver.findElement(By.xpath("//input[@class='slds-combobox__input slds-input']")).sendKeys("BootCamp");
	    
	    driver.findElement(By.xpath("//a[@class='select']")).click();
	    
	    driver.findElement(By.xpath("//a[@title='Waiting on someone else']")).click();
	    
	    driver.findElement(By.xpath("//span[text()='Save']")).click();
	    
	    String txt = driver.findElement(By.xpath("//div[contains(@class,'slds-theme--success slds-notify--toast')]")).getText();
	    
	    System.out.println(txt);
	    
	    if(txt.contains("was created.")) {
	    	System.out.println("Task created successfully");
	    }
	    else {
	    	System.out.println("Task not created successfully");
	    }
   
	   driver.close();
	    
	    
	    
	    
	}
}
