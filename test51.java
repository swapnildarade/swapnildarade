package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test51 {
public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","D:\\APPLICATIONS\\selenium-java-3.5.0\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
			String BaseURL=("https://www.google.com/");
			String exp="Google";
			
			
			driver.get(BaseURL);
			String act=driver.getTitle();
			
		WebElement l=driver.findElement(By.name("q"));
		l.sendKeys("lenovo");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//*[@id=\"tads\"]/div[1]/div[1]/div/div[1]/a")).click();
		
		Thread.sleep(100);
		
		driver.findElement(By.id("inputSearchText")).sendKeys("laptops");
		
		driver.findElement(By.xpath("//*[@id=\"msaMasthead\"]/div/div/div[4]/div/div/form/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"LEN101I00270\"]/div/div[1]/a")).click();	
			
		Thread.sleep(100);
		driver.close();
	
			
			
			if(exp.equals(act))
			{
				System.out.println("test pass");
			}
			else
			{
				System.out.println("test failed");
			}
			
			
			
		
		}

	}
