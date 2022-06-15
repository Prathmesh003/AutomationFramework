package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAssignment {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath(//button[.='x']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Laptop");
		//Thread.sleep(5000);
		driver.findElement(By.xpath(//button[@class='L0Z3Pu'])).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(//div[.= 'Core i5']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath(////div[@class='_2gmUFU _3V8rao'])[2]")).click();
	    //Thread.sleep(5000);
	    driver.findElement(By.xpath(//div[.'HP'][3]"click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath(//div[.='Operating System'])[2])).click();
	    Thread.sleep(5000)
	    driver.findElement(By.xpath(//div[.='Windows 10'])[3])).click();
	    Thread.sleep(5000);
	    String price= driver.findElement(By.xpath(//div[@class='_30jeq3 _1_WHN1']/ancestor:: div[@class='_3pLy-c row ']/decedent::div[@class='_30jeq3 _1_WHN1']")).getText();
	    System.out.println(price)
	    Thread.sleep(5000);
		

	}

}
