package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoParameter {

	@Test
	@Parameters({"username","password"})
	public void loginFacebook(String uname, String pwd) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement user = driver.findElement(By.name("email"));
		user.sendKeys(uname);

		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys(pwd);


	}

}
