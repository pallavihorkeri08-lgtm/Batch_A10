package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToLearnScreenshotOfWebPage {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	String time = LocalDateTime.now().toString().replace(":", "-");
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(3000);
	TakesScreenshot ts = (TakesScreenshot)driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File perm = new File("./Screenshot/"+time+".png");
	FileHandler.copy(temp, perm);
	
}

}
