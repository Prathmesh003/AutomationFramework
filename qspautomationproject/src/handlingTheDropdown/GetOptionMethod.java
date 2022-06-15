package handlingTheDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Prathmesh%20shinde/Desktop/Automation/singledropdown.html");

		WebElement dropdownElement = driver.findElement(By.id("menu"));

		Select sel = new Select(dropdownElement);
		List<WebElement> options = sel.getOptions();
		
		//for loop
		
		for(int i=0;i<options.size();i++)
		{
			WebElement option = options.get(i);
			String value = option.getText();
			System.out.println(value);
		}
	}

}
