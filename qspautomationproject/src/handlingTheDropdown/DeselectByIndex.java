package handlingTheDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByIndex {

				public static void main(String[] args) throws InterruptedException {
					System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
					WebDriver driver=new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("file:///C:/Users/Prathmesh%20shinde/Desktop/Automation/multipleselectdeopdown.html");
					
					Thread.sleep(4000);
					WebElement dropdownelement = driver.findElement(By.id("menu"));
					Select sel = new Select(dropdownelement);
					sel.selectByVisibleText("Samosa");
					sel.deselectByIndex("7");


	}

}
