package My_maven_project_amazon.Amazon_login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class login_button {

	//@BeforeMethod
	@Test

	public void openbr(){
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\md\\Desktop\\QTP_ UFT_selenium\\Selenium\\selenium_Browser\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\md\\Desktop\\QTP_ UFT_selenium\\Selenium\\selenium_Browser\\geckodriver-v0.10.0-win64\\geckodriver.exe");

//WebDriver dr=new FirefoxDriver();
	WebDriver dr=new ChromeDriver();

	
	//dr.manage().window().maximize();

	dr.get("https://www.amazon.com");
	dr.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	
	WebElement WebE=dr.findElement(By.xpath("//*[@id='nav-link-accountList']"));
	Actions act=new Actions(dr);
	act.moveToElement(WebE).build().perform();
	dr.findElement(By.xpath("//*[@id='nav-flyout-ya-signin']/a/span")).click();
	dr.findElement(By.name("email")).sendKeys("titomahi@gmail.com");
	dr.findElement(By.id("continue")).click();
	dr.findElement(By.id("ap_password")).sendKeys("titomahi");
	dr.findElement(By.id("signInSubmit")).click();
	
	
	}
	
}
