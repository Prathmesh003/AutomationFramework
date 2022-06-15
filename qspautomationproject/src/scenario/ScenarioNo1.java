package scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScenarioNo1 {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	FirefoxDriver  driver= new FireFoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.gmail.com");
	driver.findElement(By.id("identifierId")).sendKeys("prathmesh.shinde29@gmail.com");
	driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
	}

}
