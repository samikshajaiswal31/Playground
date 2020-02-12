import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
        int n = in.nextInt();
      int last_num = n % 10; //get last num
      while(n >= 10)
      {
        n = n /10;
      }
      int sum = n + last_num;
      System.out.println(sum);     
	}
}