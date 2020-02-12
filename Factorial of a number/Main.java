import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	   Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int fact_num = 1;
      for(int i = 1; i <= n; i++)
      {
        fact_num = fact_num * i;  // multiplying factorial starting from 1 to n
      } 
       System.out.println(fact_num);
	}
}