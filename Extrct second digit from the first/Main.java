import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    while(n >= 100)
    {
      n = n / 10; //extract all last num from first two num
    }
    int second_num = n %10; // get second num
    System.out.println(second_num);
  }
}