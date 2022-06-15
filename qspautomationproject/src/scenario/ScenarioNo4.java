package scenario;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScenarioNo4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.Ebay.com");
		Thread.sleep(2000);
		driver.findElement(By.id("gh-ac")).sendKeys("Apple Watches");
		Thread.sleep(2000);
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("h3[.='Category']")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("//contains(@data-marko,'{\\\"onclick\\\":\\\"handlechange s0-64-12-0')").click();
		

	}

}
