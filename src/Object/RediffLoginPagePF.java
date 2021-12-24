package Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePF {
	
    WebDriver driver;
    public RediffLoginPagePF(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@id='login1']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@title='Sign in']")
	WebElement submit;
	
	@FindBy(linkText="rediff.com")
	WebElement button;
	
	

	public WebElement user() {
		return username;
	}
	public WebElement pass() {
		return Password;
	}
	public WebElement sub() {
		return submit;
	}
	public WebElement go() {
		return button;
	}

}
