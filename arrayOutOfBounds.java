import java.util.Arrays;
import java.util.Scanner;
public class arrayOutOfBounds
{

	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		String Answer;
		Answer="yes";
		int Size;
		while(Answer.equalsIgnoreCase("yes"))
		{
			System.out.println("the array is between 1 and 100 what size would you like?");
			int newCount;
			newCount=scan.nextInt();
			int [] Numbers = new int[100];
			try {
			for(int count = 0; count<newCount;count++)
			{
				Numbers[count]=(int)((Math.random() * 100) + 1);
			}
			System.out.println(Arrays.toString(Numbers));
			}
			catch(ArrayIndexOutOfBoundsException ex){
				System.out.println("Out of bounds");
			}
			
			
			System.out.println("would you like to run the program again?"
					+  							" yes/no?");
			Answer=scan.next();
			if(Answer.equalsIgnoreCase("no"))
			{
				break;
			}
		}
	}
	
	
	
}


