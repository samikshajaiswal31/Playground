import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
		Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        System.out.println( (n/100) + (n%10) );
	}
}