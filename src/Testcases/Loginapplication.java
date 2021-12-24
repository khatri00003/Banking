package Testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Object.RediffHomePage;
import Object.RediffLoginPagePF;
import Object.RediffLoginpage;

public class Loginapplication {
		@Test
		public void Login(){
		System.setProperty("webdriver.chrome.driver", "//Users//gauravkhatri//Downloads//chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		/*RediffLoginpage pg=new RediffLoginpage(driver);
		pg.Email().sendKeys("Hello");;
		pg.Password().sendKeys("Bye");;
		pg.SignIn().click();
		pg.back().click();
		RediffHomePage rp=new RediffHomePage(driver);
		rp.search().sendKeys("rediff");
		rp.click().click();*/
		RediffLoginPagePF pf=new RediffLoginPagePF(driver);
		pf.user().sendKeys("Rediff");
		pf.pass().sendKeys("abc");
		pf.sub().click();
		pf.go().click();
		
	}
}