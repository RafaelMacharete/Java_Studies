package list_06.src;
import java.util.Scanner;

public class Exercise05 {
    static public void main(String... argv){
        Scanner data = new Scanner(System.in);

        int positiveBalances = 0;
        int negativeBalances = 0;
        int totalBalances = 0;

        int toContinue = 1;
        while (toContinue != 0) {
            System.out.println("Enter the balance: ");
            double balance = data.nextDouble();
            totalBalances++;

            if (balance < 0) {
                negativeBalances++;
            } else {
                positiveBalances++;
            }
            System.out.println("\nDo wanna continue inserting balances?\n[1] - Yes\n[0] - No");
            toContinue = data.nextInt();
            if (toContinue == 0) {
                System.out.println("\nInsertion stop");
                break;
            }
        }

        if (positiveBalances >= totalBalances / 2){
            System.out.println("No risks!");
        }else{
            System.out.println("There is risks!");
        }
        System.out.println(positiveBalances + " People have positive balances on the bank!");
        System.out.println(negativeBalances + " People have negative balances on the bank!");

    }
}
