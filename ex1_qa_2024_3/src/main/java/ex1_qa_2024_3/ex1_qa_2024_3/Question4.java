package ex1_qa_2024_3.ex1_qa_2024_3;
public class Question4 {
	 /* Mohamed Agbaryh 211405568 
	  Yazed Diab 314744228
	  */
	public static String Compare( double a , double b ,String mod)
	{
		
		switch(mod) {
		  
		case "regular":
			  
		    if (a < b)
		    	return "B";
		    else
		    	return "A";
		
		  case "negative":
			  if ( -a>-b)
				  return "A";
			  else
				  return "B";
			  
		  case "reciprocals":
			  if(b==0 || a==0) 
				  return "error";
						  
				  else if (1/a< 1/b) 
				  return "B";
				  
				  else
					  return "A";
			  
			   
		  default:
		  return "error";
		 
		}
	
		
	}




}
