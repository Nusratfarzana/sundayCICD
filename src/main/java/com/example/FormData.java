package com.example;

public class FormData {

    Boolean Checked = false;
    public String FName = "-NA-";// Properties
    public String LName = "-NA-";
    public String Email = "-NA-";
    public String Phone = "-NA-";
    public String Address = "-NA-";

    FormData() // Default Constucor-0 //   FormData formDataObjX = new FormData(  );
    {
        
    }

    //FormData formDataObjZ = new FormData("John","Last","jon@email.com","1234","Toronto");
    FormData(String val1,String val2,String val3,String val4,String val5) // Default Constucor-1
    {
        FName = val1;
        LName = val2;
        Email = val3;
        Phone = val4;
        Address = val5;
    }

    String GetFullName()
    {
        String fullName = "Mr. " + FName + " - " + LName;
        return fullName;
    }
    

}
