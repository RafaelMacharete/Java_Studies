package list_03.src;

import java.util.Scanner;
public class Exercise02 {
    static public void main(String... argv){
        Scanner data = new Scanner(System.in);

        System.out.println("Enter the unit value: ");
        double unitValue = data.nextDouble();

        System.out.println("Enter the quantity: ");
        int quantity = data.nextInt();

        if(quantity <= 12){
            double totalValue = quantity * unitValue;
            System.out.println("The total value is: " + totalValue + " without a discount");
        }else{
            double totalValue = (quantity * unitValue) * 0.90;
            System.out.println("The total value is: " + totalValue + " with a discount of 10%");
        }
        data.close();
    }
}
