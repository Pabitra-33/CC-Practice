import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int X = sc.nextInt();//the lower limit on the number of sticks
		    int Y = sc.nextInt();//the no of sticks on a single plate
		    int R = sc.nextInt();//the money received by Chef
		    int A = R/30; //extra no of free sticks get
		    int B = X + A; //total no of sticks
		    int C = B%Y;
		    if(C==0){
		        System.out.println(B/Y);
		    }
		    else{
		        System.out.println((B/Y)+1);
		    }
		} 
	}
}
