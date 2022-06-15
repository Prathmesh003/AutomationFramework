package actionsclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        driver.get("https://demo.guru99.com/");
	        driver.findElement(By.xpath("//button[contains(.,'Double')]")).click();	        
	}

}
