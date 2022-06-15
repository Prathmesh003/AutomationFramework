package scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ScenarioNo3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver  driver= new FireFoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://jqueryui.com/droppable/");
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));

		Actions act = new Actions(driver);
		act.dragAndDrop(src, target).perform();

	}

}
