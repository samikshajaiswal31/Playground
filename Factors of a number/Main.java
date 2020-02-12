import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	   Scanner in = new Scanner(System.in);
       int n = in.nextInt();   
      for(int fact_num = 1; fact_num <= n;  fact_num++)
      {
        if(n % fact_num == 0)  
          System.out.println(fact_num);     
      }   
	}
}
