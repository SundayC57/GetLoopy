import java.util.Random;
import java.util.Scanner;
public class DiceRoller {
    static void main(String[] args){

        Random rand = new Random();
        Scanner in = new Scanner(System.in);


        int roll = 0;
        int sum = 0;
        String answer = "";
        boolean done = false;

        String temp = "%5s %5s %5s %5s %5s%n";

        System.out.printf(temp, "Roll", "Die1", "Die2", "Die3", "Sum");
        System.out.printf("---------------------------------------------------%n");

        do {
            int die1 =  rand.nextInt(6)+1;
            int die2 =  rand.nextInt(6)+1;
            int die3 =  rand.nextInt(6)+1;
            done = false;

            while (die1 != die2 || die2 != die3) {
                die1 = rand.nextInt(6) + 1;
                die2 = rand.nextInt(6) + 1;
                die3 = rand.nextInt(6) + 1;
                roll++;
                sum = die1 + die2 + die3;
                System.out.printf("%5d\t%-3d\t%3d\t%5d\t%5d\n", roll, die1, die2, die3, sum);
            }

            System.out.printf("%5d\t%-3d\t%3d\t%5d\t%5d\n", roll, die1, die2, die3, sum);
            IO.print("Would you like to roll again? (y/n): ");
            answer = in.nextLine();

            if (answer.equals("y"))
            {
                done = false;
            }
            else
            {
                done = true;
            }

        }while(done == false);

    }
}
