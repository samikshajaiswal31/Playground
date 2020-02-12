import java.util.Scanner;
class Main
{
	public static void main (String[] args)
{
	    Scanner in = new Scanner(System.in);
	    int base = in.nextInt();
	    int exponent = in.nextInt();
        int power = power_of_a_number(base, exponent);
	    System.out.print(power);
	}
    
	public static int power_of_a_number(int b, int exp)
	{
	    int power = 1;
	    while(exp >= 1)
	    {
	        power = power * b;
	        exp--;
	    }
	    return power;
	}
}