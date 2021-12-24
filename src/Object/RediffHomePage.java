package Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {
	
	public RediffHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	WebDriver driver;
	
	By Search=By.xpath("//input[@id='srchword']");
	By Click=By.xpath("//input[@value=' ']");
	
	public WebElement search() {
		return driver.findElement(Search);
	}
	public WebElement click() {
		return driver.findElement(Click);
	}
	

}
