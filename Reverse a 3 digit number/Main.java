import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner (System.in);
    int n = in.nextInt();
    System.out.println(  (n%10) +""+ ((n%100)/10) +""+ (n/100)  );
  }
}