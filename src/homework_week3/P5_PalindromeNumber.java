package homework_week3;

import java.util.Scanner;

public class P5_PalindromeNumber {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = Scanner.nextInt();
        System.out.println("Does number :"+num+"is a palindrome?"+ispalindrome(num));
    }
    private static boolean ispalindrome(int number){
        int reverse = 0;
        int OriginalNumber = number;

        while (number !=0){
            int lastDigit=number%10;
            reverse=(reverse *10)+lastDigit;
            number/=10;

        }

        return originalnumber==reverse;
    }
}
