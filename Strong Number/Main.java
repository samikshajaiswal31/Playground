import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int sum = 0;
       int copy_n = n;
      while(n > 0)
      { 
       int rem = n % 10;           // for getting last digit
       int fact_num = 1;
       for(int i = 1; i <= rem; i++)
       {
         fact_num = fact_num * i;  // multiplying factorial starting from 1 to rem
       } 
       sum = sum + fact_num;       //adding fact one by one
       n = n / 10;                 // descarding last digit
      }
      if(copy_n == sum)
       System.out.println("Yes"); 
      else
        System.out.println("No"); 
       
	}
}