import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.example.MathCalculator;

public class TestMath {


    @Test
    void TestX()
    {
        SeleniumTest_Guru99 obj = new SeleniumTest_Guru99();
    }
    @Test(priority = 3) // Annotation
    public void TestPrimeWithDiffrentValues()
    {
        MathCalculator obj = new MathCalculator();

        boolean returnedVlaue =  obj.PrimeChecker(102);
        Assert.assertEquals(returnedVlaue,false);
      
        boolean returnedVlaueFor19 =  obj.PrimeChecker(19);               
        Assert.assertEquals(returnedVlaueFor19,true);
    }

    @Test(priority = 2)
    public void TestAdditionWithDiffrentValues()
    {
        MathCalculator obj = new MathCalculator();

        int returnedVlaue =  obj.Add2Numbers(10,20);
        Assert.assertEquals(returnedVlaue,30); //?? Pased
      
        int returnedVlaueFor19 =  obj.Add2Numbers(-5 , 5);               
        Assert.assertEquals(returnedVlaueFor19,0);

        Assert.assertEquals(obj.Add2Numbers(-5 , 2), -3);

        Assert.assertEquals(obj.Add2Numbers(0 , 0), 0);
    }

    @Test(priority = 1)
    public void TestDifferenceWithDiffrentValues()
    {
        MathCalculator obj = new MathCalculator();
       
        Assert.assertEquals(obj.DifferenceNumbers(10,8),2); //?? Pased
      
        Assert.assertEquals(obj.DifferenceNumbers(10,12),2); //?? Pased

        Assert.assertEquals(obj.DifferenceNumbers(3,0),3); //?? Pased
    }

}
