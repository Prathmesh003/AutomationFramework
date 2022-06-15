package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentNo4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		 driver.findElement(By.id("denyBtn")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//div[@class='lc-o7mqve e16i86ec1']")).click();
		 driver.switchTo().frame("chat-widget");
			driver.findElement(By.xpath("//p[.='Leave a message']")).click();
		
		 
		
		
	}

}
