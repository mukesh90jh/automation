package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GitHubLogin {

	WebDriver driver=null;
	@BeforeMethod
	public void setup(){
		driver=new FirefoxDriver();
		driver.get("https://github.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);

	}

	@Test(priority=1,enabled=true)
	public void LoginWithValidCreadentails(){
		driver.findElement(By.cssSelector("#login_field")).sendKeys("mukesh90jh");
		driver.findElement(By.cssSelector("#password")).sendKeys("Mukesh1@3");
		driver.findElement(By.cssSelector("input[name='commit']")).click();
		String userName=driver.findElement(By.cssSelector("img[class='avatar']")).getAttribute("alt").trim();
		new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("img[class='avatar']")));
		Assert.assertEquals(userName,"@mukesh90jh","Not Able to login with valid "+userName+" and password");

	}

	@Test(priority=2,enabled=true)
	public void LoginWithInValidCreadentails(){
		driver.findElement(By.cssSelector("#login_field")).sendKeys("mukesh90jh");
		driver.findElement(By.cssSelector("#password")).sendKeys("Mukesh1@33");
		driver.findElement(By.cssSelector("input[name='commit']")).click();
		String incorrectMessage=driver.findElement(By.cssSelector("div[class^='flash flash-full']>div")).getText().trim();
		Assert.assertEquals(incorrectMessage,"Incorrect username or password.","Incorrect username or password. message is not displaying for invalid user");

	}

	@AfterMethod
	public void quit(){
		driver.quit();
	}

}
