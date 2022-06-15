package scenario;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScenarioNo5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.Bluestone.com");
		driver.findElement(By.id("denyBtn")).click();
        Thread.sleep(5000);
        WebElement targetToMouseHover=
        driver.findElement(By.xpath("//li[@class='menuparent repb']/a[@title='Rings']"));
        Actions act= new Actions(driver);
        act.moveToElement (targetToMouseHover).perform();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[text()='Diamond Rings']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("Price-form")).click();

	}

}
