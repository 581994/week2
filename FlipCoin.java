/******************************************************************************
  
 *  Purpose: Determine % of Head and Tail.
 *
 *  @author  Akash
 *  @version 1.0
 *  @since   18-08-2017
 *
 ******************************************************************************/
 
package com.bridgelabz.util;



import java.util.*;

public class FlipCoin 
{

    
    public static void main(String[] args) 
    {
        int head=0,tail=0;
        double rand;
	Scanner sc=new Scanner(System.in);
	int FlipTimes= sc.nextInt();
	int n=FlipTimes;
	while(FlipTimes!=0)
	{
 	   rand=Math.random();
	    if(rand>0.5)
 	   {
  	      head++;
        
  	  }
  	  else
 	   {
   	     tail++;
  	  }
FlipTimes--;
}
     System.out.println("Head Percentage is:"+(head*100)/n);
     System.out.println("Tail Percentage is:"+(tail*100)/n);
    }
}
    
