package swdDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGetAndNavigate {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver(); //to open chrome browser  
		driver.manage().window().maximize(); //to maximaze the window
		driver.get("http://ebay.com");    // to open a url in the browser
		driver.navigate().to("http://amazon.in"); // used to open url but has some exta methods like to, back,....
		driver.navigate().back();
	}

}
