import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.example.Notification;

import dev.failsafe.internal.util.Assert;



public class SeleniumTest_Guru99 {

	WebDriver driver =  new ChromeDriver();;

		
	public  void AddCustomerToTarrif(String cID)
	{


	}

	@Test(priority = 1)
	@Parameters({"firstName", "lastName","email","phone","address"})
	public void AddCustomer(String firstName, String lastName,String email, String phone,String address) throws InterruptedException {
		
		driver.get("https://demo.guru99.com/telecom/addcustomer.php");
		Thread.sleep(2000);
		SetValues(firstName,  lastName, email,  phone, address);

		if(firstName == null || firstName.isEmpty())
		{
			ClickSubmitButton();			
			Alert alert = driver.switchTo().alert();
			String alertMessage = alert.getText();
			org.testng.Assert.assertEquals(alertMessage, "please fill all fields");
			alert.accept();
		}
		if(lastName == null || lastName.isEmpty())
		{
			ClickSubmitButton();			
			Alert alert = driver.switchTo().alert();
			String alertMessage = alert.getText();
			org.testng.Assert.assertEquals(alertMessage, "please fill all fields");
			alert.accept();
		}
	}


	private void SetValues(String firstName, String lastName,String email, String phone,String address) throws InterruptedException 
	{
		WebElement fname = driver.findElement(By.id("fname"));
		fname.sendKeys(firstName);

		WebElement lname = driver.findElement(By.id("lname"));
		lname.sendKeys(lastName);

        
		WebElement myEmail = driver.findElement(By.id("email"));
		myEmail.sendKeys(email);

		WebElement mymessage = driver.findElement(By.name("addr"));
		mymessage.sendKeys(address);

		WebElement myphone = driver.findElement(By.id("telephoneno"));
		myphone.sendKeys(phone);
		Thread.sleep(2000);
        System.out.println("Done2");
	}
	private void ClickSubmitButton()
	{
		driver.findElement( By.xpath("//*[@id=\"main\"]/div/form/div/div[1]/label") ).click();
		WebElement btn = driver.findElement(By.name("submit"));
		btn.click();
	}

	
}
