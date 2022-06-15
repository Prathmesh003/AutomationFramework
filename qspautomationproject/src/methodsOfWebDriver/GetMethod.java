package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("hhtps://omaya.blogspot.com/");
				driver.close();
			

	}

}
