package list_06.src;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise04 {
    static public void main(String... argv){
        Scanner data = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = data.nextInt();

        System.out.println("Enter a increasement: ");
        int increasement = data.nextInt();

        ArrayList<Integer> numbersList = new ArrayList<Integer>();

        int count = 0;
        while (count <= number){
            numbersList.add(count);
            count += increasement;
        }

        System.out.println(numbersList);
    }
}
