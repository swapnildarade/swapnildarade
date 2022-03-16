package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class register {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "D:\\APPLICATIONS\\selenium-java-3.5.0\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
	        driver.get("https://www.shine.com/");
	        
	        WebElement e= driver.findElement(By.xpath("//*[@id=\"__next\"]/header[1]/div[3]/div/div/div[2]/div[2]/span/i"));
	        e.click();
	        
	        WebElement name= driver.findElement(By.xpath("//*[@id=\"__next\"]/header[1]/div[3]/div/div/div[2]/div[2]/ul/li[2]/a"));
	        name.click();
	        
	        WebElement b= driver.findElement(By.id("id_name"));
	        b.sendKeys("swapnil");
	        
	        WebElement email= driver.findElement(By.id("id_email"));
	        email.sendKeys("swapnil0123@gmail.com");
	     
	        WebElement number= driver.findElement(By.id("id_cell_phone"));
	        number.sendKeys("9028115303");
	        
	        WebElement pass= driver.findElement(By.id("id_password"));
	        pass.sendKeys("Passs@123");
	        
	        WebElement but= driver.findElement(By.id("registerButton"));
	        but.click();
	     
	       
		System.out.println("account login");
	}

}
