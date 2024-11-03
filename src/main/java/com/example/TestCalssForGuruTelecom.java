package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCalssForGuruTelecom {

    private static WebDriver driver = new ChromeDriver();// Mozilla// Safari
    public static String AddCustomer() throws InterruptedException {

		
		driver.get("https://demo.guru99.com/telecom/addcustomer.php");
		Thread.sleep(2000);

		WebElement fname = driver.findElement(By.id("fname"));
		fname.sendKeys("THIS IS FNAME");

		WebElement lname = driver.findElement(By.id("lname"));
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
        System.out.println("DOne3");

		 return "12334";

	}

	public static void AddTarrif () throws InterruptedException
	{
		
		driver.findElement(By.xpath("rental1"));

		Thread.sleep(10);

		WebElement objLocalMin = driver.findElement(By.id("local_minutes"));

		Thread.sleep(10);
		WebElement objIntlMin = driver.findElement(By.id("inter_minutes"));

		objIntlMin.sendKeys("5001");
		Thread.sleep(10);
		WebElement objsmsPa = driver.findElement(By.id("sms_pack"));
		objsmsPa.sendKeys("150");

		Thread.sleep(10);
		WebElement objminutes_charges = driver.findElement(By.id("minutes_charges"));
		objminutes_charges.sendKeys("250");

		Thread.sleep(10);
		WebElement objinter_charges = driver.findElement(By.id("inter_charges"));
		objinter_charges.sendKeys("350");

		Thread.sleep(10);
		WebElement objsms_charges = driver.findElement(By.id("sms_charges"));
		objsms_charges.sendKeys("350");

		Thread.sleep(1000);

		WebElement objSUBMITbTN = driver.findElement(By.name("submit"));
		objSUBMITbTN.click();
	}
	
	public static void AddCustomerToTarrif(String cID)
	{

	}


}
