package javaPractice;

import java.util.Arrays;

public class Java1 
{
	public static void main(String srgs[])
	{
		String str= "I hate java";
		System.out.println(str);
	    String[] str1 = str.split(" ");

		for(int i=str1.length-1; i>=0; i--)
		{	 String word = str1[i];
			System.out.println(word);
		}
		String rev = Arrays.toString(str1);
		System.out.println(rev);
		
		
		/*char ch[]=str.toCharArray();  
	    String rev="";  
	    for(int i=ch.length-1;i>=0;i--){  
	        rev+=ch[i]; 
	    }
	    
	    System.out.println(rev);*/
	}
	
	
	
}
