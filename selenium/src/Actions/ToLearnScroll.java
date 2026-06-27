package Actions;

import java.awt.Button;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnScroll {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.cricbuzz.com/");
	
	WebElement button = driver.findElement(By.xpath("//button[.='More News']"));
	Actions act = new Actions(driver);
	act.scrollToElement(button).perform();
	button.click();
	
}

}
