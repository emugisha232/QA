package swdDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningBrowserDemo {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("http://ebay.com");
		
	}

}
