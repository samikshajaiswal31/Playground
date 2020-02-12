import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	   Scanner in = new Scanner(System.in);
       int n = in.nextInt(); 
       int copy_n = n;
      int count = 0;
      if(n == 0)     
      {
        System.out.println(n);    // if given number is 0
      }
      else
      {
        while(n > 0)
        {
          count++;        // count digit of given number
          n = n / 10;
        }
      }
      n = copy_n;        //return given number 
      int sum = 0;
      int pow = 1;
      while(n > 0)
      {
        int rem = n % 10;    // getting last digit from given number
        for(int i = 1; i <= count; i++)
        {
          pow = pow * rem;  // getting factorial of each digit
        }
        sum = sum + pow;    // adding each fact digit one by one
        pow = 1;
        n = n / 10;         // descarding the last digit
      }
      if(sum == copy_n)
      {
       System.out.println("Armstrong Number"); 
      }  
      else
      {
        System.out.println("Not a Armstrong Number");
      }  
	}
}