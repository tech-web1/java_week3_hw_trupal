package homework_week3;

import java.util.Scanner;

public class P7_FirstAndLastDigit {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Number:");
        int num=Scanner.nextint();
        System.out.println(sumFirstAndlastDigit(num));

    }

    public static int sumFirstAndlastDigit(int number){
        int lastDigit=number %10;
        int sum =0;

        if (number >=10){

            while ((number/10)>=10){

                number =number/10;

            }
            number=number/10;
            sum=lastDigit+number;
            return sum;

        } else if (number<0) {
            return -1;

        }
        sum=number*=2;
        return sum;
    }
}
