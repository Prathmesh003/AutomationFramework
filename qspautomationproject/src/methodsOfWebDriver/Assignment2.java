package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			
			WebElement usernameTextBox = driver.findElement(By.name("username"));
			List<WebElement> suggestions =driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
			usernameTextBox.sendKeys("admin");
			System.out.println(usernameTextBox);
			WebElement passwordTextBox = driver.findElement(By.name("pwd1234"));
			passwordTextBox.sendKeys("manager");

	}

}
