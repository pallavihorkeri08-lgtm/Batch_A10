package Popups;

import java.time.Duration;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnChildWindow {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.shoppersstack.com/products_page/51");
	driver.findElement(By.id("compare")).click();
	Set<String> allwindids = driver.getWindowHandles();
	for(String id:allwindids) {
		
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.flipkart.com/")) {
			driver.close();
		}
		else if(url.equals("https://www.flipkart.com/")) {
			driver.manage().window().maximize();
		}else if(url.equals("https://www.ebay.com/")) {
			driver.close();
		}
	}
}

}
