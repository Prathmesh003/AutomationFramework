package robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClassAssignment {

		public static void main(String[] args) throws AWTException, InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("https://www.selenium.dev");
			 Thread.sleep(4000);
			WebElement target = driver.findElement(By.xpath("//h4[@class='h3 mb-3 selenium-webdriver']"));
			Actions act = new Actions(driver);
			act.contextClick(target).perform();
			
			
			Thread.sleep(4000);
	
			
			
			for(int i=0;i<10;i++)
			{
			Robot robot = new Robot();
			
			
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
			}
			Thread.sleep(2000);
			
			Robot robot3 = new Robot();
			robot3.keyPress(KeyEvent.VK_ENTER);
			Robot robot2 = new Robot();
			robot2.keyRelease(KeyEvent.VK_ENTER);
			}
			

}










