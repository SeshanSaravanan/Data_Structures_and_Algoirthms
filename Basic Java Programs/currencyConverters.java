import java.util.Scanner;

public class currencyConverters {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the amount in Indian Rupees: ");
        double inr = scan.nextDouble();

        double usd = inr * 0.0125; // exchangeRate = 0.125
        System.out.println("Amount in US Dollars: " + usd);

        scan.close();
    }

}
