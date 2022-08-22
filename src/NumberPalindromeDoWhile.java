//program to check the number is a palindrome.

import javax.swing.*;
import java.util.Scanner;

public class NumberPalindromeDoWhile
{

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number= s.nextInt();
        s.nextLine();
       if(isPalindrome(number))
        {
            System.out.println(number+" is Palindrome.");
        }
        else
        {
            System.out.println(number+" is not palindrome");
        }
    }


    public static boolean isPalindrome(int number)
    {
        int reverse = 0;
        int i = 0;
        int r = 0;

        reverse = number;
        do {
            i = number % 10;

            r = (r * 10) + i;
            number = number / 10;
        } while (number != 0);
        if (r == reverse)
        {
            return true;
        } else {
            return false;
        }
    }
}
