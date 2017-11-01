import java.util.Scanner; //importing scanner class
public class Square
{

    public static void main(String[] args)
    {
    	double area; //creating double for area
    	double circumference; //creating double for circumference
    	
    	System.out.println("Enter the radius of a circle: "); //prompting user for radius
    	Scanner scan = new Scanner(System.in);//preparing scanner to accept radius
    	double radius = scan.nextDouble();//telling scanner to put input into the variable double
    	area = Math.PI * (radius * radius); //calculating area from the recently imported double as well as signifying r^2 as radius*radius
    	System.out.printf("The area of the circle is: %.2f\n", area);//printing the area
    	circumference = Math.PI * 2 * radius; //calculating the circumference
    	System.out.printf("The circumference of the circle is: %.2f", circumference);//printing the circumference
    	
    	System.out.println();//pagebreak 1
    	System.out.println();//pagebreak 2
    	
    	System.out.println("Enter the circumference of a circle: ");
    	circumference = scan.nextDouble();
    	
    	double diameter = circumference / Math.PI;
    	double roundedDiameter = (double)Math.round(diameter * 100.0) / 100.0; 
    	
    	System.out.printf("The diameter of the circle is: %.2f", roundedDiameter);
    	
    	
    }
   
}

