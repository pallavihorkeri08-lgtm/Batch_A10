package Synchronization;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnExplicitWait {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	LocalDateTime.now().toString().replace(":", "-");
	driver.get("https://www.shoppersstack.com/products_page/51");
	
	driver.findElement(By.id("Check Delivery"));
	
	 
	
	
	
}

}
