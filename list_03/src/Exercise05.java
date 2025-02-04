package list_03.src;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String... argv) {
        Scanner data = new Scanner(System.in);

        System.out.println("Current Stock:");
        int quantityInStock = data.nextInt();

        System.out.println("Maximum Quantity: ");
        int maximumQuantity = data.nextInt();

        System.out.println("Minimum Quantity: ");
        int minimumQuantity = data.nextInt();

        int avarageOfQuanitity = (maximumQuantity + minimumQuantity) / 2;
    
        if(quantityInStock >= avarageOfQuanitity){
            System.out.println("Do not make purchase");
        }else{
            System.out.println("Make purchase");
        }

        data.close();
    }
}
