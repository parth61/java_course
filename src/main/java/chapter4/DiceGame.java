package chapter4;

import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        int total = 0;
        int goal = 20;
        int rolls = 5;
        Random rand = new Random();

        for  (int i = 1; i <= rolls; i++) {
            int die = rand.nextInt(6)+1;
            total = total + die;
            System.out.printf("Roll #%d: You've rolled a %d.",i,die);
            if (total == goal) {
                System.out.printf("You are on space %d. Congrats you win!.", die);
                break;
            }
            else if (total > goal) {
                System.out.printf("Unfortunately that take you past %d spaces. You Lose!", goal);
                break;
            } else if (i == rolls) {
                System.out.printf("Unfortunately you didn't make it to %d spaces. You Lose!", goal);
                break;
            }
            else{
                System.out.print("You are now on space " + total + " and have " + (goal-total) + " more to go.");
            }
            System.out.println();
        }


    }
}
