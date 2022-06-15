package actionsclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://bluestone.com/");
        driver.findElement(By.id("denyBtn")).click();
        Thread.sleep(5000);
        WebElement targetToMouseHover=
        driver.findElement(By.xpath("//li[@class='menuparent repb']/a[@title='Rings']");
        Actions act= new Actions(driver);
        act.moveToElement (targetToMouseHover).perform();
	}

}
