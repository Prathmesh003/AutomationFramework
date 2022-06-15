package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://google.com");
		driver.switchTo().activeElement().sendKeys("facebook",Keys.ENTER);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();		
	}

}
