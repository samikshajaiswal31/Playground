import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
      int base = in.nextInt();
      int exp = in.nextInt();
      int res =  1;
      while(exp != 0)
      {
        res = (res * base);
        exp--;
      }
       System.out.println(res) ;
    }
}