package demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewTest {






@Test
public void login()
{
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "D:\\APPLICATIONS\\selenium-java-3.5.0\\chromedriver.exe");
	 driver= new ChromeDriver();
	 driver.get("https://www.oracle.com/index.html"); 
	 
	 
	WebElement bb1=driver.findElement(By.id("u30-flyout"));
    bb1.click();
	
	 WebElement bb2=driver.findElement(By.xpath("//*[@id=\"u30-profilew1\"]/ul[1]/li[1]/a"));
    bb2.click();
    
    WebElement bb3=driver.findElement(By.id("sso_username"));
    bb3.click();

    WebElement bb4=driver.findElement(By.id("sso_username"));
    bb4.sendKeys("swapnildarade0123@gmail.com");
    
    WebElement bb6=driver.findElement(By.id("ssopassword"));
    bb6.click();

    WebElement bb5=driver.findElement(By.id("ssopassword"));
    bb5.sendKeys("Pass@123");
    
    WebElement bb7=driver.findElement(By.id("signin_button"));
    bb7.click();
    
    driver.navigate().back();

    
}
@Test
public void search()
{
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "D:\\APPLICATIONS\\selenium-java-3.5.0\\chromedriver.exe");
	 driver= new ChromeDriver();
	 driver.get("https://www.amazon.com/"); 
	 
	  WebElement b=driver.findElement(By.id("twotabsearchtextbox"));
      b.click();
      WebElement b1=driver.findElement(By.id("twotabsearchtextbox"));
      b1.sendKeys("moving chair");
      WebElement b2=driver.findElement(By.id("nav-search-submit-button"));
      b2.click();
    
   
    
    
}
@Test()
public void signUp()
{
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "D:\\APPLICATIONS\\selenium-java-3.5.0\\chromedriver.exe");
	 driver= new ChromeDriver();
	 driver.get("https://www.oracle.com/index.html"); 
	 
	  WebElement b=driver.findElement(By.id("u30-flyout"));
      b.click();
      
      WebElement b2=driver.findElement(By.xpath("//*[@id=\"u30-profilew1\"]/ul[1]/li[2]/a"));
      b2.click();
      
      WebElement b3=driver.findElement(By.name("sView1:r1:0:email"));
      b3.click();
      
      WebElement name=driver.findElement(By.name("sView1:r1:0:email"));
      name.sendKeys("swapnildarade0123@gmail.com");
      
      WebElement b4=driver.findElement(By.name("sView1:r1:0:password"));
      b4.click();
      
      WebElement pass=driver.findElement(By.name("sView1:r1:0:password"));
      pass.sendKeys("Swapnil@123");
      
      WebElement b5=driver.findElement(By.name("sView1:r1:0:retypePassword"));
      b5.click();
      
      WebElement rpass=driver.findElement(By.name("sView1:r1:0:retypePassword"));
      rpass.sendKeys("Swapnil@123");
      
      WebElement b6=driver.findElement(By.name("sView1:r1:0:firstName"));
      b6.click();
      WebElement b9=driver.findElement(By.name("sView1:r1:0:firstName"));
      b9.sendKeys("swapnil");
      
      WebElement b7=driver.findElement(By.name("sView1:r1:0:lastName"));
      b7.click();
      WebElement b8=driver.findElement(By.name("sView1:r1:0:lastName"));
      b8.sendKeys("darade");
      
      WebElement b12=driver.findElement(By.name("sView1:r1:0:jobTitle"));
      b12.click();
      WebElement b11=driver.findElement(By.name("sView1:r1:0:jobTitle"));
      b11.sendKeys("engineer");
      
      WebElement b13=driver.findElement(By.name("sView1:r1:0:workPhone"));
      b13.click();
      WebElement b14=driver.findElement(By.name("sView1:r1:0:workPhone"));
      b14.sendKeys("9028115303");
      
      WebElement b15=driver.findElement(By.name("sView1:r1:0:companyName"));
      b15.click();
      WebElement b16=driver.findElement(By.name("sView1:r1:0:companyName"));
      b15.sendKeys("mph");
      
      WebElement b17=driver.findElement(By.id("sView1:r1:0:address1::content"));
      b17.click();
      WebElement b18=driver.findElement(By.id("sView1:r1:0:address1::content"));
      b18.sendKeys("pune");
      
      
      WebElement b19=driver.findElement(By.id("sView1:r1:0:city::content"));
      b19.click();
      WebElement b20=driver.findElement(By.id("sView1:r1:0:city::content"));
      b20.sendKeys("pune");
      
      
      Select se = new Select(driver.findElement(By.id("sView1:r1:0:state::content")));
      se.selectByIndex(21);
      
      WebElement b21=driver.findElement(By.id("sView1:r1:0:postalCode::content"));
      b21.click();
      WebElement b22=driver.findElement(By.id("sView1:r1:0:postalCode::content"));
      b22.sendKeys("444 444");

      WebElement b23=driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:b1\"]/a"));
      b23.click();
      WebElement b24=driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:b1\"]/a"));
      b24.click();
     
      driver.navigate().back();
}

@Test
public void addcart()
{
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "D:\\APPLICATIONS\\selenium-java-3.5.0\\chromedriver.exe");
	 driver= new ChromeDriver();
	 driver.get("https://www.amazon.com/"); 
	 
	  WebElement b=driver.findElement(By.id("twotabsearchtextbox"));
      b.click();
      WebElement b1=driver.findElement(By.id("twotabsearchtextbox"));
      b1.sendKeys("pen");
      WebElement b2=driver.findElement(By.id("nav-search-submit-button"));
      b2.click();
      WebElement b3=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div/div[1]/span/a/div/img"));
      b3.click();
      WebElement b4=driver.findElement(By.id("add-to-cart-button"));
      b4.click();
	
}





}