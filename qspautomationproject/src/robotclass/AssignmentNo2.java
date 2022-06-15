package robotclass;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentNo2 {

		public static void main(String[] args) throws AWTException, InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("https://www.selenium.dev");
			 WebElement target = driver.findElement(By.xpath("//button[contains(.,'Double')]"));
		        Actions act = new Actions(driver);
		        act.doubleClick(target).perform();

	}

}
