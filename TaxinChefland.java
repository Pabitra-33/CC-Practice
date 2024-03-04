/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner kj = new Scanner(System.in);
		int T = kj.nextInt();
		for (int i=1;i <=T; i++){
		    int X = kj.nextInt();
		    if(X<=100){
		        System.out.println(X);
		    }
		    else{
		        System.out.println(X-10);
		    }
		    
		} 
	}
}
