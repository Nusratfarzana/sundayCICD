package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.semconv.SemanticAttributes.SystemCpuStateValues;

import java.util.ArrayList;

public class Main {

	
	
	public static void main(String[] args) throws InterruptedException 
	{
		TestCalssForGuruTelecom obj = new TestCalssForGuruTelecom();
		String customerID = obj.AddCustomer();
		

	}
	
	private static ArrayList GetSomeFormData() 
	{
		
		FormData obj1 = new FormData();// No para		
		FormData obj3 = new FormData("BArak","Obama","president@whitehouse.com","123","D.C");
		
		ArrayList myArrListForObj = new ArrayList<FormData>();
		myArrListForObj.add(obj1);		
		myArrListForObj.add(obj3);
		myArrListForObj.add(new FormData());
		myArrListForObj.add(new FormData("Kamala","Harris","president@whitehouse.com","123","D.C"));

		return myArrListForObj;
	}
	
	public static void GetListOfNumber() {
		FormData formDataObjX = new FormData();
		FormData formDataObjY = new FormData("Barak", "Obama", "President@Whitehouse.com", "555889965", "Keneya");
		FormData formDataObjZ = new FormData("John", "Abraham", "jon@email.com", "1234", "Toronto");

		ArrayList<FormData> myFormDataList = new ArrayList<FormData>();
		myFormDataList.add(formDataObjX);
		myFormDataList.add(formDataObjY);
		myFormDataList.add(formDataObjZ);

		// myFormDataList.size() = 3
		for (int i = 0; i < myFormDataList.size(); i++) {
			System.out.println(myFormDataList.get(i).FName);
			System.out.println(myFormDataList.get(i).LName);
			System.out.println(myFormDataList.get(i).Email);
			System.out.println();
		}
	}

	
}