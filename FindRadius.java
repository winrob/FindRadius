import java.util.Scanner;

public class FindRadius{
	public static void main(String[] args){
		//declare variables
		double radius, area;
		
		//ask the user to enter radius
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		radius = input.nextDouble();
		
		//calculate the area
		area = radius * radius * 3.1415;
		
		//display output
		System.out.println("Area of a circle with radius " + radius + " is " + area);
	}
}