import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" , "//Users//gauravkhatri//Downloads//chromedriver 2");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String Parent=it.next();
		String Child=it.next();
		driver.switchTo().window(Child);
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		String Course=driver.findElements(By.xpath("h4 a[id='lp1']")).get(1).getText();
		
	}

}
