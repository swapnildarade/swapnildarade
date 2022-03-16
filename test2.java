package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args) {
	
		  System.setProperty("webdriver.chrome.driver", "D:\\APPLICATIONS\\selenium-java-3.5.0\\chromedriver.exe");
	        WebDriver driver= new ChromeDriver();
	        driver.get("https://m.facebook.com/");
	        
	        WebElement email= driver.findElement(By.xpath("//*[@id=\"m_login_email\"]"));
	        email.sendKeys("swapnil@gmail.com");
	        
	        WebElement pass= driver.findElement(By.xpath("//*[@id=\"m_login_password\"]"));
	        pass.sendKeys("swapnil@gmail.com");
	        
	        WebElement button= driver.findElement(By.xpath("//*[@id=\"login_password_step_element\"]/button"));
	        button.submit();
	       
	        driver.close();
		System.out.println("account login");
		
		
		
		
	}

}
