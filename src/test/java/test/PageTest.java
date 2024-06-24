package test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.RegistrationPage;



public class PageTest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.purrform.co.uk/login.php?action=create_account");
		driver.manage().window().maximize();
	}
@Test
public void testlogin() throws IOException
{
	RegistrationPage rp=new RegistrationPage(driver);
	
	File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src,new File("C:\\Users\\shebe\\eclipse-workspace\\Project\\Screenshots\\purrform.png"));
	rp.mailinfo();
	rp.gccid();
	rp.radiobutton();
    rp.extraid();
	rp.dropdownbuttn();
	rp.personal();
	rp.location();
	rp.checkbox();
	rp.submit();
	
}
}
