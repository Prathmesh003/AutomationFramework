package eliminateDuplicate;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicate3 {
		public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/Prathmesh%20shinde/Desktop/Automation/multipleselectdeopdown.html");

			WebElement dropdownElement = driver.findElement(By.id("menu"));

			Select sel = new Select(dropdownElement);

			//get the list of WebElements
			
			List<WebElement> options = sel.getOptions();

			//decalre a set to eliminate the duplicate data
			TreeSet<String> s = new TreeSet<String>();
			//read the list and get the text
			for(int i=0;i<options.size();i++)
			{

				WebElement ops = options.get(i);
				String text = ops.getText();
				//add the text to set so that duplicates won't be accepted
				//order of insertion is maintained
				s.add(text);
			}

			//read the set
			for(String se :s)
			{
				System.out.println(se);
			}

	}

}
