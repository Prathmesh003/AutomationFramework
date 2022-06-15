package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/Prathmesh%20shinde/Desktop/Automation/textbox.html");

			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");

	}

}
