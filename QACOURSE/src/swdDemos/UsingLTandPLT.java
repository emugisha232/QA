package swdDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLTandPLT {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.com");
		
		//driver.findElement(By.linkText("Sell")).click(); // find link called Sell and click
		
		driver.findElement(By.partialLinkText("Sign")).click(); //If the link contain Sign, it will click on it
	}

}
