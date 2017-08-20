
/******************************************************************************
  
 *  Purpose: Determines whether string is Anagram or not
 *
 *  @author  Akash
 *  @version 1.0
 *  @since   18-08-2017
 *
 ******************************************************************************/
import java.util.Arrays;


class Anagram extends StringFunction
{
   
	static boolean isAnagram() 

	{
   		
		
			String A="earth";
			
			String B="heart";
		
		Boolean retValue = false;
  
		if(A != null && B != null)
		{
			String C = A.replaceAll("\\W","");
       			String D = B.replaceAll("\\W","");
       
      			char [] arrayA  = C.toLowerCase().toCharArray();
      			char [] arrayB = D.toLowerCase().toCharArray();
       			Arrays.sort(arrayA);
       			Arrays.sort(arrayB);
       			retValue = Arrays.equals(arrayA, arrayB);
   		}
  	 return retValue;
	}
}
