
/******************************************************************************
  
 *  Purpose: Enter month and year it will display calender,
 *
 *  @author  Akash
 *  @version 1.0
 *  @since   18-08-2017
 *
 ******************************************************************************/

class Calender
{

	static String mDay[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	static String mMon[]={"jan","feb","mar","aprl","may","jun","july","aug","sept","oct","nov","dec"};

	public static void main(String a[])
	{
		int m=Integer.parseInt(a[0]);

		int y=Integer.parseInt(a[1]);
	
		DayOfWeek(m,y);
	}

	
	/*
	* This method will check how many days in a month.
	*/

	static void DayOfWeek(int m,int y)
	{
		
    		int d=1;
		int y0,x,m0,d0;	
        	int numDays=0;
        
        
		y0=y-(14-m)/12;
		x=y0+y0/4-y0/100+y0/400;
		
		
		
		m0=m+12*((14-m)/12)-2;
		d0=(d+x+31*m0/12)%7;
		
		
		
		System.out.println("\nCalender\n");
       
		System.out.println("month "+mMon[m-1]+" year "+y0);
        
       		if (m0 == 2)

 	       {

	             if ( (y0 % 4 == 0) && (y0 % 400 == 0) && !(y0 % 100 == 0) )
 
			numDays = 29;

                else

         		numDays = 28;
        	}

       		else if (m0 == 1 || m0 == 3 || m0 == 5 || m0 == 7 || m0 == 8 || m0 == 10 || m0 == 12)
  	     	{

			numDays = 31;
       		}
      		else
        	{

   		        numDays = 30;
        	}

		System.out.println("\n");
        	System.out.println("S  M  T  W  T  F  S\n");
        
        	int k=0;

		//it print like a calender.

        	for(int i=1;i<=numDays;i++)
            	{
                
                	if(i==1)
                	{
                    		for(int j=0;j<d0;j++) 
                    		{
                    			System.out.print("   ");
                    			k++;
                    		}
                	}
                	
			if(k==7)
                	{
                    		k=0;
                    		System.out.print("\n");
	                }

			if(i>=1 && i<=9)
			{
                	    	k++;
                 	   	System.out.print(" "+i+" ");
			}
			else
			{
				k++;
                 	  	System.out.print(""+i+" ");
			}
                                      
          	}
	}
        
        
}