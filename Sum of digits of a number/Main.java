import java.util.Scanner;
class Main {
	public static void main (String[] args){
	  Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
      while(n > 0) 
      {
        int rem = n %10; // for getting last num
        sum = sum + rem; // add last num
        n = n /10; // remove last num
      }
      
      System.out.println(sum);
	}
}