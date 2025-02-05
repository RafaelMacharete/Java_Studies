package list_06.src;

import java.util.Scanner;

public class Exercise03 {
    static public void main(String... argv){
        Scanner data = new Scanner(System.in);

        char toContinue = 'Y';

        int great_rate = 0;
        int good_rate = 0;
        int bad_rate = 0;

        int total_rate = 0;
        while (toContinue == 'Y'){
            System.out.println("Do you want rate the movie?\n[Y] - Yes\n[N] - No");
            toContinue = data.next().charAt(1);

            if (toContinue == 'N'){
                break;
            }
            total_rate++;

            System.out.println("How was the movie?\n[3] - Great\n[2] - Good\n[1] - Bad");
            int rating = data.nextInt();

            if (rating == 3){
                great_rate++;
            }else if(rating == 2){
                good_rate++;
            }else{
                bad_rate++;
            }
        }
        double percentage_great = (double)great_rate / total_rate * 100;
        double percentage_good = (double)good_rate / total_rate * 100;
        double percentage_bad = (double)bad_rate / total_rate * 100;

        System.out.println("");
    }
}
