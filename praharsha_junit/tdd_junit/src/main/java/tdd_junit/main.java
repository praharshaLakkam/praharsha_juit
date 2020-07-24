package tdd_junit;

public class main implements access{
	
public String accept(String st)
{   
        String s1="";
	
      int y=st.length();
	if(y>=2)
	{
		if(st.charAt(0)!='A')
		{
			s1=s1+st.charAt(0);
			
		}
		if(st.charAt(1)!='A')
		{
			s1=s1+st.charAt(1);
			
		}
		if(y>2)
		{
			
			s1=s1+st.substring(2,y);
			
		}
	
		
	}
	else
	{
		if(y==1)
		{
			if(st.charAt(0)!='A')
			{
				s1=s1+st.charAt(0);
				
			}	
			
			
		}
		}
	
	
   return(s1);
}
}
