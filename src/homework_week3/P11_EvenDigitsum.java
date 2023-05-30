package homework_week3;

import java.util.Scanner;

public class P11_EvenDigitsum {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);

        System.out.println("Enter Number: ");
        int num =Scanner.nextInt();
        System.out.println(getEvenDigitsum(num));
    }
    public static int getEvenDigitsum(int number){
        int originalNumber=number;
        int lastDigit;
        int sumofEvenDigits=0;
        if(number >=0){
            while (number >0){
                lastDigit=number %10;
                if (lastDigit % 2==0){
                    sumofEvenDigits+=lastDigit;
                }
                if(originalNumber>=0){
                    System.out.println("The sum of even digits within a number"+originalNumber+"is equal to");

                }
                return sumofEvenDigits;

            }
            System.out.println("Invalid input:");
            return -1;

        }
    }
}
