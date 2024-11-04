package com.example;

public class MathCalculator {

    public Boolean PrimeChecker(int x)
	{
        //x=x+1;
		
		Boolean prime = true;
		return prime;


		/*
		for(int i = 2; i< x-1;i++)
		{
			if(x%i == 0)
			{
				 prime = false;
				 break;
			}
		}
		//System.out.println(prime);

        return prime;
		 */

	}

	public int Add2Numbers(int x  , int y)
	{
		int z = x+y;
		return z;
	}

	public int Sub2Numbers(int x  , int y)
	{
		int z = x-y;
		return z;
	}

	public int DifferenceNumbers(int x  , int y)
	{

		if(x>y)
			return x-y;
		else
			return y-x;
		
	}
}
