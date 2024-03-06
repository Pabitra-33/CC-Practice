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
		Scanner fd = new Scanner(System.in);
		int T = fd.nextInt();//no of test cases
		for(int k=1;k<=T;k++)
		{
		    int X = fd.nextInt();//no of RTP courses
		    int Y = fd.nextInt();//no of audit courses
		    int Z = fd.nextInt();//no of non-RTP courses
		    System.out.println(4*X + 2*Y + 0*Z);
		}
	}
}
