package com.example;

public class Employee {
    
    String Name;
    String Designation;
    int Salary;
    

    public Employee()
    {
       
    }
    public Employee(String emName,int Sal)
    {
        Name = emName;
        Salary = Sal;
    }
    public String GetReportingBossName()
    {
        if(Salary < 100 )   
        {
            return "Jackson";
        }       
        else
        {
            return "President";
        }
    }
}


