package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssignmentNo5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("////div[@class='lc-o7mqve e16i86ec1']")).click();
	}

}
