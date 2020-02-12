import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int sum = sum_of_num(n);
      System.out.println(sum);
	}
  public static int sum_of_num (int num)
  { 
    int sum = 0;
    for(int i = 1; i <= num ; i++)
    {
      sum = sum + i;
    }
    return sum;
  }
}