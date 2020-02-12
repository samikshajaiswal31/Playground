import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int square = sq_of_num(n);
      System.out.println(square);
	}
  public static int sq_of_num(int num)
  {
    int sqr = num * num ;
    return sqr;
  }
}