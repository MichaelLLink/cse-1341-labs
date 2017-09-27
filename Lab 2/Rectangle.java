import java.util.Scanner;
class Rectangle {
   public static void main (String[] args)
   {
	   Scanner scanRectangle = new Scanner(System.in);
	   System.out.println("What is the length of this rectangle?:");
	   double length = scanRectangle.nextDouble();
	   System.out.println("What is the length of the width?:");
	   double width = scanRectangle.nextDouble();
	   //Area = length*width;
	   double area = length*width;
	   System.out.println("Area of Rectangle is:"+area);
   }
}
