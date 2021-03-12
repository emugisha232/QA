package swdDemos;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingWindowHandles {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://naukri.com");

		//getting currently focused window id
//		String winID = driver.getWindowHandle();
//		System.out.println(winID + " ==>" + driver.getTitle());

		
		Set<String> winIds = driver.getWindowHandles(); // getting information of all windows
		for (String id : winIds) {

			driver.switchTo().window(id); //shift focused window to specific window
			System.out.println(id + " ==>" + driver.getTitle()); // display window ID and TITLE

		}
	}

}
