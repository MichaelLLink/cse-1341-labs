import java.util.Scanner;
public class TargetProfit {
public static void main(String[] args)
{
	Scanner tpinput = new Scanner(System.in);
	System.out.println("What is the profit margin (%) target? ");	
	double profitMargin = tpinput.nextDouble();
	System.out.println("What is the cost of the product?");
	double cost = tpinput.nextDouble();
	double price = cost * (cost * (profitMargin/100));
	System.out.printf("The target price is $ %5.2f", price);
}

}