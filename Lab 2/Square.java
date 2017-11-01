//Michael Link, 47402281, CSE 1341 Lab 2 - Fall 2017
import java.util.Scanner; //used to access the Scanner class to allow the user to input information
class Square
{

    public static void main(String[] args)
    {
			int length; //Used to store the length of the square
      System.out.println("What is the length of the square? "); //asking for length
      Scanner scan = new Scanner(System.in);
      length = scan.nextInt(); //getting input for the length
      int perimeter = 4 * length; //calculating the perimeter
      int area = (int)Math.pow(length, 2); //calculating the area
      System.out.printf("The area of the square is: %d", area);
      System.out.println("");
      System.out.printf("The perimeter of the square is: %d", perimeter);
    }
}
