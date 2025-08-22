package chapter4;

import java.util.Scanner;

public class LetterSearch  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter letter : ");
        String letter = input.nextLine();
        input.close();
        boolean letterFound = false;
        for (int i = 0; i <letter.length() ; i++) {
            char currentLetter = letter.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a')
            {
                letterFound = true;
                break;
            }
        }
        if (letterFound)
        {
            System.out.println("Letter contains letter 'A'");
        }
        else System.out.println("Letter doesnot contains letter 'A'");
    }
}
