import java.util.Scanner; //importing scanner class
public class TargetProfit
{

    public static void main(String[] args)
    {
    	double percentage;
    	
    	System.out.println("What is the profit margin (%) target? ");	
    	Scanner tpinput = new Scanner(System.in);
    	double profitMargin = tpinput.nextDouble();
    	percentage = profitMargin / 100;
    	System.out.println("What is the cost of the product?");
    	double cost = tpinput.nextDouble();
    	cost = profitMargin * percentage;
    	double price = profitMargin + cost;
    	System.out.printf("The target price is: $%.2f", price);
    }
   
}

