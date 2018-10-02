/**
 * 
 * @author kimyang
 * Input Rectangle Homework
 */
import java.util.Scanner;

public class InputPractice 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		
		
		System.out.print("Input the rectangle length:   ");
		
		double recLength = in.nextDouble();
		in.nextLine();
		
		System.out.print("Input the rectangle width:   ");
		double recWidth = in.nextDouble();
		in.nextLine();
		
		System.out.printf("\nThe area of the rectangle is: %15.2f", recLength*recWidth);
		System.out.printf("\nThe perimeter of the rectangle is: %10.2f", 2*recLength+ 2*recWidth);
		double diagonal = Math.sqrt(recLength*recLength+recWidth*recWidth);
		System.out.printf("\nThe diagonal length of the rectangle is: %.2f", diagonal);
	}

}
