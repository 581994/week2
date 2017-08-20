package com.bridgelabz.util;

/******************************************************************************
  
 *  Purpose: Some math functions are in this program.
 *
 *  @author  Akash
 *  @version 1.0
 *  @since   18-08-2017
 *
 ******************************************************************************/
 
import java.util.Scanner;


/*
* This class finding some Mathematical value of :-
* HarmonicNumber
* Sin To Cos conversion
* Cos To Sin Conversion
* Binary
* Factorial
* min max value from array
* Checking Collinear or not using slop or area
* To check no is prime or not
*/

class Conversion extends MathFunction
{
	static int i,n;
	
	static int HarmonicNumber()
	{
		System.out.println("Enter any no.");
		int Hnumber=sc.nextInt();
		
		for(int i=1;i<Hnumber;i++)
		{
			mSum=mSum+Math.pow(i,-1);
		
		}
			System.out.println(mSum);
			return 0;
	}
	
	static int SinToCos()
	{
		System.out.println("Enter any no. to get sine value");
		int s=sc.nextInt();
		System.out.println("Sin of "+s+"= "+Math.sin(s));
		return 0;
	}
	
	
	static int CosToSin()
	{
		System.out.println("Enter any no. to get cos value");
		int c=sc.nextInt();
		System.out.println("Cos of "+c+"= "+Math.cos(c));
		return 0;
	}
	
	static int Binary()
	{
		System.out.println("Enter any Decimal value");
		a=sc.nextInt();
		
		int b[]=new int[a];
			
		
		while(a>0)
		{
			b[index]=a%2;
			a=a/2;
			index++;
		
		
		}
		System.out.println("Binary is \n");
		for(int i=index-1;i>=0;i--)
		{
			System.out.print(b[i]);
		
		}
			return 0;
	}
	
	static int FindFactorial()
	{
		System.out.println("Enter no to find factorial");
		int f=sc.nextInt();
		int i,fact=1;
		
		for(i=1;i<=f;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	static int MinMax(int id,int a1[])
	{
		
		for(int i=1;i<a1.length;i++)
		{
			
			if(large<a1[i])
			{
				large=a1[i];
			
			}
			if(small>a1[i])
			{
				small=a1[i];
			
			}
			
		}
		if(id==10)
		{
			return small;
		}
		else 
		{
			return large;
		}
	}
	static boolean CollinearSlop(int id)
	{
		System.out.println("Enter the values of x1,y1,x2,y2,x3,y3");
		x1=sc.nextInt();
		y1=sc.nextInt();
		x2=sc.nextInt();
		y2=sc.nextInt();
		x3=sc.nextInt();
		y3=sc.nextInt();
		
		if(id==12)
		{
			ab=(y2-y1)/(x2-x1);
			bc=(y3-y2)/(x3-x2);
			ac=(y3-y1)/(x3-x1);
		
			if(ab==bc || bc==ac || ab==ac)
				return true;
			else
				return false;
		}
		else
		{
			if(1/2*((x1-x2)*(y2-y3)-(y1-y2)*(x2-x3))==0)
				return true;
			else
				return false;
		}
	}
	
	public static boolean primeFunction()
	{
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no ");
		n=sc.nextInt();
		int count=0;
		for(i=1;i<=n;i++)
		{		
				if(n % i == 0)
				{
					count++;
				}
		}

			if(count==2)
			{
				return true;
			}
			else
			{
				return false;
			}
	}	
	
}



/*
* This class find Square root.
*/

 class Newton //extends MathFunction
 {

    // return the square root of c, computed using Newton's method
    public static double sqrt(double c) 
	{
        if (c < 0) return Double.NaN;
        double EPSILON = 1E-15;
        double t = c;
        while (Math.abs(t - c/t) > EPSILON*t)
            t = (c/t + t) / 2.0;
        return t;
    }

    // overloaded version in which user specifies the error tolerance epsilon
    public static double sqrt(double c, double epsilon) 
	{
        if (c < 0) return Double.NaN;
        double t = c;
        while (Math.abs(t - c/t) > epsilon*t)
            t = (c/t + t) / 2.0;
        return t;
    }
	
}

/*
* Determines future and present compound intrest.
*/

class Compound extends MathFunction
{
	
	/*
	* This mehod determine future compound intrest.
	*/
	
	static double CalculateF()
	{
		System.out.println("Plz enter the values of c,t,r");
		c=sc.nextDouble();
		t=sc.nextDouble();
		r=sc.nextDouble();
		return c*Math.pow(1+r,t);
	}
	
	/*
	* This mehod determine present compound intrest.
	*/
	
	static double CalculateP()
	{
		System.out.println("Plz enter the values of c,t,r");
		c=sc.nextDouble();
		t=sc.nextDouble();
		r=sc.nextDouble();
		return c/Math.pow(1+r,t);
	}
}




// main class 

class MathFunction
{
	static int x1,y1,x2,y2,x3,y3;
	static boolean status;
	static int ab,bc,ac;
	static double mSum;
	static int ch;
	static int a,index;
	static int a1[]={11 ,2,3,15,1,0,55,54,5,9,7};
		static int large=a1[0];
		static int small=a1[0];
	public static double c,r,t;
	
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String... aa)
	{
		do{
			
			System.out.println("\n********************  Enter your choice  ********************\n");
			System.out.println("press 0 for EXIT\n1.   for Harmonic number\n2.   for Sin to cos\n3.   for Cos to Sin\n4.   convert into Binary no\n5.   Find Sqrt\n6.   prime or not\n7.   Find Factorial\n8.   Find Compound future value\n9.   Find Compound present value\n10.  Find Min Value\n11.  Find Max Value\n12.  Check colinear using slop\n13.  Check colinear using area");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				
					Conversion.HarmonicNumber();
					break;
					
				case 2:
			
					Conversion.CosToSin();
					break;
				case 3:
					Conversion.SinToCos();
					break;
					
				case 4:
			
					Conversion.Binary();
					break;
				case 5:
					System.out.println("Enter any no");
					int c=sc.nextInt();
					double x = Newton.sqrt(c);
					System.out.println(x);
					break;
				case 6:
						status=Conversion.primeFunction();
						System.out.println(status);
						break;
				case 7:
				
						System.out.println("Factorial is"+Conversion.FindFactorial());
						
						break;
				case 8:
				
						System.out.println("Compound"+Compound.CalculateF());
						
						break;
				case 9:
				
						System.out.println("Compound"+Compound.CalculateP());
						
						break;
				case 10:
				
						System.out.println("Min value"+Conversion.MinMax(10,a1));
						
						break;
				case 11:
				
						System.out.println("Max value"+Conversion.MinMax(11,a1));
						
						break;
				case 12:
						status=Conversion.CollinearSlop(12);
						if(status==true)
							System.out.println("colinear");
						else
							System.out.println("non-colinear");
						break;
				case 13:
						status=Conversion.CollinearSlop(13);
						
						if(status==true)
							System.out.println("colinear");
						else
							System.out.println("non-colinear");
						break;
				default:
						System.out.println("Plz select any above statement");
				        break;
			}
		}while(ch!=0);
	}
}

		

		