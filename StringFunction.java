import java.util.*;


class StringFunction
{
	
	static String mPalindrom="palindrome";
	static String mNotPalindrom="Not a palindrome";
	
	static boolean output;
	
	public static void main(String... args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("press 1 to check string is palindrome or not\npress 2 to check string Anagram or not");
		int choice=sc.nextInt();

		if(choice==1)
		{
				
			Palindrome();	
		}
		else if(choice==2)
		{
			

			System.out.println("Anagram : "+Anagram.isAnagram());

		}
		else
		{
			System.out.println("Choose proper option");
		}	
		
	}


	static void Palindrome()
	{
		
		
			String name="malayalam";

			char c[]=name.toCharArray();		
		
		char a[]=new char[c.length];
		
		//System.out.println(n);		

		for(int j=0,i=c.length-1;i>=0;i--,j++)
		{
			a[j]=c[i];
		}
		

		for(int k=0;k<a.length;k++)
		{
			if(a[k]==c[k])
			{
				output=true;
			}
			else
			{
				output=false;
				k=a.length;
			}
		}
		

		if(output==true)
		{
			System.out.println(mPalindrom);
		}
		else
		{
			System.out.println(mNotPalindrom);
		}
	}



	
}