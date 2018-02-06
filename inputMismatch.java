import java.util.Scanner;
import java.util.InputMismatchException;
public class inputMismatch
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		int Numbers, sum;
		sum=0;
		Numbers=1;
		System.out.println("Enter numbers and the loop will end when 0 is entered");
		sum(Numbers, sum);
		

	}
	public static int sum(int Numbers, int sum)
	{
		Scanner scan = new Scanner(System.in);
		do
		{
			try{
			Numbers=scan.nextInt();
			sum=Numbers+sum;
		}
			catch(InputMismatchException ex){
			System.out.println("No letters, only numbers");
			scan.next();
		}
		}while(Numbers!=0);
		System.out.println("The sum is " + sum);
		return sum;
	}
}
