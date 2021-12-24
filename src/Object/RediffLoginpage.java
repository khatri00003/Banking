package Object;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginpage {

	WebDriver driver;
	public RediffLoginpage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
	}
		
		By username=By.xpath("//input[@id='login1']");
		By password=By.xpath("//input[@id='password']");
		By SignIn=By.xpath("//input[@title='Sign in']");
		By Button=By.linkText("rediff.com");
		
		public WebElement Email() {
			return driver.findElement(username);
		}
		public WebElement Password() {
			return driver.findElement(password);
		}
		public WebElement SignIn() {
			return driver.findElement(SignIn);
		}
		public WebElement back() {
			return driver.findElement(Button);
		}
		
}

