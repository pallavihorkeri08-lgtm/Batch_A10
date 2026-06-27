package Assignment;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
    String stamptime = LocalDateTime.now().toString().replace(":", "-");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    
    driver.get("https://www.shoppersstack.com/");
    driver.findElement("")
	
}

}
