import java.util.Random;
public class Dice_Roller {
    static void main(){

        Random rand = new Random();

        int die1 =  rand.nextInt(6)+1;
        int die2 =  rand.nextInt(6)+1;
        int die3 =  rand.nextInt(6)+1;
        int roll = 0;
        int sum = 0;

        while(die1 != die2 || die2 != die3) {
            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;
            die3 = rand.nextInt(6) + 1;
            roll++;
            sum = die1 + die2 + die3;
        }



        System.out.printf("%5d\t%3\t%3d\t%3d\t%5d\n", roll, die1, die2, die3, sum);
    }
}
