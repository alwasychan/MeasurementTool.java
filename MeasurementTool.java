

import java.util.Scanner;

public class MeasurementTool{
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		int choice;

		do{
			System.out.println("Choose a shape to perform operation: ");
			System.out.println("1. Area of parallelogram");
			System.out.println("2. Volume of Cube");
			System.out.println("3. Perimeter of Equilateral Triangle");
			System.out.println("4. Exit");
			System.out.println("Enter your choce: ");
			choice = scnr.nextInt();

			switch(choice){
			case 1: 
				System.out.println("Enter base: ");
				double base = scnr.nextDouble();
				System.out.println("Enter height: ");
				double height = scnr.nextDouble();
				double area = scnr.nextDouble();
				System.out.println("Area of Parallelogram = " + area);
				break;

			case 2:
				System.out.print("Enter side: ");
				double sideCube = scnr.nextDouble();
				double volume = sideCube * sideCube * sideCube;
				System.out.println("Volume of Cube = " + volume);
				break;


			case 3:
				System.out.print("Enter side: ");
				double sideTriangle = scnr.nextDouble();
				double perimeter = 3 * sideTriangle;
				System.out.println("Perimeter of Equilateral Triangle = " + perimeter);
				break;

			case 4: 
				System.out.println("Exiting Program, Goodbye!");
				break;

			default:
				System.out.println("Invalid Choice! Please enter a number between 1-4.");
			}
		} while (choice != 4);

		scnr.close();
	}
}





