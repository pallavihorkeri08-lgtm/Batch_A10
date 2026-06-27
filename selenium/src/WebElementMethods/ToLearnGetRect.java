package WebElementMethods;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetRect {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement search = driver.findElement(By.xpath("//input[@value='Search']"));
	 Rectangle size = search.getRect();
	System.out.println(size.getHeight());
	System.out.println(size.getWidth());
	System.out.println(size.getX());
	System.out.println(size.getY());
	
}

}
