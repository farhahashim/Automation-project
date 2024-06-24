package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	WebDriver driver;
	By email = By.xpath("//*[@id=\"FormField_1_input\"]");
	By pswrd = By.xpath("//*[@id=\"FormField_2_input\"]");
	By cpswrd = By.xpath("//*[@id=\"FormField_3_input\"]");
	By gcc=By.xpath("//*[@id=\"FormField_26_input\"]");
	By user =By.xpath("//*[@id=\"FormField_28\"]/label[2]");
	By xid=By.xpath("//*[@id=\"FormField_31_input\"]");
	By loyal=By.xpath("//*[@id=\"FormField_35_select\"]");
	By first = By.xpath("//*[@id=\"FormField_4_input\"]");
	By last=By.xpath("//*[@id=\"FormField_5_input\"]");
	By company=By.xpath("//*[@id=\"FormField_6_input\"]");
	By mobno=By.xpath("//*[@id=\"FormField_7_input\"]");
	By address1 =By.xpath("//*[@id=\"FormField_8_input\"]");
	By address2 =By.xpath("//*[@id=\"FormField_9_input\"]");
	By city =By.xpath("//*[@id=\"FormField_10_input\"]");
	By country =By.xpath("//*[@id=\"FormField_11_select\"]");
	By state=By.xpath("//*[@id=\"FormField_12_input\"]");
	By code=By.xpath("//*[@id=\"FormField_13_input\"]");
	By chkbox=By.xpath("//*[@id=\"FormField_25\"]/label[2]");
	By account=By.xpath("//*[@id=\"main-content\"]");
	
public RegistrationPage(WebDriver driver)
{
	this.driver=driver;
}
public void mailinfo()
{
	driver.findElement(email).sendKeys("adcd@gmail.com");
	driver.findElement(pswrd).sendKeys("faraa@123");
	driver.findElement(cpswrd).sendKeys("faraa@123");
	
}
public void gccid()
{
	driver.findElement(gcc).sendKeys("FA123");
}
public void radiobutton()
{
	WebElement ur=driver.findElement(user);
	ur.click();
}
	public void extraid()
	{
		driver.findElement(xid).sendKeys("efgh@gmail.com");
	}
	public void dropdownbuttn()
	{
		
	WebElement dropdown = driver.findElement(loyal);
	Select dp=new Select(dropdown);
	dp.selectByIndex(1);
}
	public void personal()
	{
		driver.findElement(first).sendKeys("Faraa");
		driver.findElement(last).sendKeys("Aashii");
		driver.findElement(company).sendKeys("RIO");
		driver.findElement(mobno).sendKeys("009646745674");
		
	}

public void location()
{
	driver.findElement(address1).sendKeys("streetno:124");
	driver.findElement(address2).sendKeys("buildingno:7,center square");
	driver.findElement(city).sendKeys("hillton");
	 
	WebElement countrydp=driver.findElement(country);
	Select cdp=new Select(countrydp);
	cdp.selectByIndex(8);
	
	driver.findElement(state).sendKeys("peace");
	driver.findElement(code).sendKeys("0080");
}

public void checkbox()
{
	WebElement chb=driver.findElement(chkbox);
	chb.click();
	if(chb.isEnabled())
	{
		System.out.println("checkbox is selected");
	}
	else
	{
		System.out.println("Not selected");
	}
}

	public void submit()
	{
		driver.findElement(account).click();
	}
	
}









