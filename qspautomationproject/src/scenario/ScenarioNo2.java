package scenario;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ScenarioNo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver  driver= new FireFoxDriver();
		driver.manage().window().maximize();
		

	}

}
