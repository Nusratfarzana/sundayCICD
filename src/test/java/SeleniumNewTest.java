import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.example.MathCalculator;

public class SeleniumNewTest {
    

    // NA = this is not a test method
    public void NotForTesting()
    {
        MathCalculator obj = new MathCalculator();
        int num1 = 100;
		int num2 = -150;
        int sum = obj.Add2Numbers(num1, num2);
    }

    @Test // @test = this is a test method
    public void TestMathFunctions()
    {
        MathCalculator obj = new MathCalculator();
        int num1 = 100;
		int num2 = -150;
        int sum = obj.Add2Numbers(num1, num2);
        Assert.assertEquals(sum, num1+num2);
    }
    @Test // @test = this is a test method
    public void TestMathFunctions2()
    {
        MathCalculator obj = new MathCalculator();
        int num1 = -100;
		int num2 = -150;
        int sum = obj.Add2Numbers(num1, num2);
        Assert.assertEquals(sum, num1+num2);
    }


    @Test
    @Parameters({"firstName", "lastName","email","phone","address"})
    public void TestSelenium(String firstName, String lastName,String email, String phone,String address ) 
    throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();// Mozilla// Safari

        driver.get("https://demo.guru99.com/telecom/addcustomer.php");
		Thread.sleep(2000);

		WebElement fname = driver.findElement(By.id("fname"));
		fname.sendKeys(firstName);

		WebElement lname = driver.findElement(By.id("lname"));
		lname.sendKeys(lastName);

        System.out.println("DOne1");

		WebElement myEmail = driver.findElement(By.id("email"));
		myEmail.sendKeys(email);

		WebElement mymessage = driver.findElement(By.name("addr"));
		mymessage.sendKeys(address);

		WebElement myphone = driver.findElement(By.id("telephoneno"));
		myphone.sendKeys(phone);
		Thread.sleep(2000);
        System.out.println("DOne2");

        driver.findElement( By.xpath("//*[@id=\"main\"]/div/form/div/div[1]/label") ).click();
		WebElement btn = driver.findElement(By.name("submit"));
		btn.click();
        System.out.println("DOne3");
        
    }




}
