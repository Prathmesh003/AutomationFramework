package webelementmethod;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev");
		
		WebElement news = driver.findElement(By.xpath("//h2[.='News']"));
		org.openqa.selenium.Point loc = news.getLocation();
		int xaxis = (int) loc.getX();
		int yaxis = (int) loc.getY();
	
		
		System.out.println(xaxis+" x axis distance");
		System.out.println(yaxis+" y axis distance");
		
		org.openqa.selenium.Rectangle rect = news.getRect();
		int height = rect.getHeight();
		int width = rect.getWidth();
		
		
		System.out.println(height+" height");
		System.out.println(width+ " width");

	}

}
