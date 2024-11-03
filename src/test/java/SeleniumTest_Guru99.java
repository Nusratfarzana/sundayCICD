import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.example.Notification;


public class SeleniumTest_Guru99 {

	WebDriver driver =  new ChromeDriver();;

		
	public  void AddCustomerToTarrif(String cID)
	{


	}

	@Test(priority = 1)
	@Parameters({"firstName", "lastName"})
	public void AddCustomer(String firstName, String lastName) throws InterruptedException {
		
		driver.get("https://demo.guru99.com/telecom/addcustomer.php");
		Thread.sleep(2000);

		WebElement fname = driver.findElement(By.id(firstName));
		fname.sendKeys("THIS IS FNAME");

		WebElement lname = driver.findElement(By.id(lastName));
		lname.sendKeys("THis is LNae from Java Code");

        System.out.println("DOne1");

		WebElement myEmail = driver.findElement(By.id("email"));
		myEmail.sendKeys("zakir108@gmail.com");

		WebElement mymessage = driver.findElement(By.name("addr"));
		mymessage.sendKeys("adasdijasldijalds");

		WebElement myphone = driver.findElement(By.id("telephoneno"));
		myphone.sendKeys("323232178");
		Thread.sleep(2000);
        System.out.println("DOne2");

        driver.findElement( By.xpath("//*[@id=\"main\"]/div/form/div/div[1]/label") ).click();
		WebElement btn = driver.findElement(By.name("submit"));
		btn.click();
        System.out.println("Done3");
	}


	
}
