import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class screenshot {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//gauravkhatri//Downloads//chromedriver 3");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	//Full Screenshot
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("/Users/gauravkhatri/Downloads/Screenshot/s.png"));
	//Partial Screenshot
		WebElement title=driver.findElement(By.cssSelector("body h1"));
		File file=title.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("abc.png"));
		
		System.out.println(title.getRect().getDimension().getHeight());
		System.out.println(title.getRect().getDimension().getWidth());
	}

}
