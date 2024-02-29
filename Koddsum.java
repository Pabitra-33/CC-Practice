import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main(String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner dc = new Scanner(System.in);
		int T = dc.nextInt();//no of test cases
		while(T--> 0){
		    int N = dc.nextInt();//length
		    int K = dc.nextInt();//required no of indices
		    for(int i=1; i<=K; i++){
		        System.out.print(i+" ");
		    }
		    for(int i=K+1; i<=N; i=i+2){
		        System.out.print(i+" ");
		    }
		    for(int i=K+2; i<=N; i=i+2){
		        System.out.print(i+" ");
		    }
		    System.out.println();
		    
		}
	}
}
