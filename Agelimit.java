import java.util.Scanner;

class Codechef
{
    public static void main (String[] args)
    {
        Scanner read = new Scanner(System.in);
        
        int t = read.nextInt();
        for(int i=0; i<t; i++)
        {
            // Accept 3 integers inputs
            int x = read.nextInt();
            int y = read.nextInt();
            int a = read.nextInt();
            
            // Check if Chef is eligible to give the exam
            if(a>=x && a<y){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}