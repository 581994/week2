
/******************************************************************************
  
 *  Purpose: Determines Day of the week.
 *
 *  @author  Akash
 *  @version 1.0
 *  @since   18-08-2017
 *
 ******************************************************************************/

class DayOfWeek
{
	static String mDay[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"}; 
	static int y0,x,m0,d0;

	public static void main(String a[])
	{
		// we take 3 input from command line.
		
		int m=Integer.parseInt(a[0]);
		int d=Integer.parseInt(a[1]);
		int y=Integer.parseInt(a[2]);
		
		Calender.FindDay(m,d,y);
	}

}




// finding the day of week.

class Calender extends DayOfWeek
{

	
	
	
	static void FindDay(int m,int d, int y)
	{
		

			

		y0=y-(14-m)/12;
		x=y0+y0/4-y0/100+y0/400;
		
		
		
		m0=m+12*((14-m)/12)-2;
		d0=(d+x+31*m0/12)%7;
		
		System.out.println(d+"-"+m+"-"+y+" = "+mDay[d0]);

	}
}