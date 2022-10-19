import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MarathonTestCase1 {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://login.salesforce.com");
 
		driver.manage().window().maximize();
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	//enter username
	    
	    driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
	  //enter password
	    driver.findElement(By.id("password")).sendKeys("Password#123");
	    
	    //Login 
	    driver.findElement(By.id("Login")).click();
	    
	    driver.findElement(By.className("slds-icon-waffle")).click();
	    
	    driver.findElement(By.xpath("//button[text()='View All']")).click();
	    
	    driver.findElement(By.xpath("//p[text()='Sales']")).click();
	    
	    driver.findElement(By.xpath("//span[text()='Accounts']")).click();
	    
	    driver.findElement(By.xpath("//div[@title='New']")).click();
	    
	    driver.findElement(By.name("Name")).sendKeys("Jayasree");
	    
	    driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input slds-input_faux')])[3]")).click();
	    
	    driver.findElement(By.name("SaveEdit")).click();
	    
	    String txt = driver.findElement(By.xpath("//span[@data-aura-class='forceActionsText']")).getText();
	    
	    System.out.println(txt);
	    
	    if(txt.contains("was created.")) {
	    	System.out.println("Account created successfully");
	    }
	    else {
	    	System.out.println("Account not created successfully");
	    }
   
	   
	    
	    
	    
	
	}
	
	
}
