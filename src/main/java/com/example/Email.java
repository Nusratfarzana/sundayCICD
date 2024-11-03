package com.example;

public class Email implements Notification {

    public String SenderID = "zakir108@gmail.com";
    public String ToID = "zakir@Yahoo.com";
    public String CCID = "zakir@Yahoo.com";
    public String BCCID = "zakir@Yahoo.com";
    public String Body = "zakir@Yahoo.com";
    public String Subject = "zakir@Yahoo.com";

    public void Send()// Version-001
    {
        System.out.println("Sending email from " + SenderID );
        System.out.println("Sending email To " + ToID );
    }
    public void Send(String x)// Version-002
    {
        System.out.println("Sending email from " + SenderID );
        System.out.println("Sending email To " + ToID );
    }
    public void Send(String x,String y)// Version-003
    {
        System.out.println("from " + SenderID );
            
    }






    public void AddAttchment()
    {

    }
}
