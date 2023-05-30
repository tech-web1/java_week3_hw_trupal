package homework_week3;

import java.util.Scanner;

public class P13_ShareDigit {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter number1: ");
        int num1 = Scanner.nextInt();
        System.out.println("Enter number2: ");
        int num2 = Scanner.nextInt();
        System.out.println(hasshareDigit(num1,num2));
    }
    public static boolean hasshareDigit(int number1, int number2){
        if((number1<=10 || number1 >=99)) && (number2 <=10 || number2 >=99)){
         return false;
        }
        int numberonefirstDigit =number1/10;
        int numberTwoFirstDigit=number2/10;
        int numberoneLastDigit =number1 % 10;
        int numberTwoLastDigit = number2 / 10;


        if (numberonefirstDigit==numberTwoFirstDigit||numberonefirstDigit==numberTwoLastDigit||numberoneLastDigit==numberTwoLastDigit){
            return true;

        }else {
            return false;
        }


    }
}
