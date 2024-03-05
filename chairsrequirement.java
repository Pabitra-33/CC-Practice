import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
		    int a=s.nextInt();
		    int b=s.nextInt();
		    if(a>=b)
		    {
		        System.out.println(a-b);
		    }
		    else if(a<b)
		    {
		        System.out.println("0");
		    }
		}

	}
}
