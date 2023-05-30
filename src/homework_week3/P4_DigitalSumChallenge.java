package homework_week3;

import java.util.Scanner;

public class P4_DigitalSumChallenge {
    public static Scanner Scanner=new Scanner(System.in);

    public static void main(String[] args) {
        int num = Scanner.nextInt();
        System.out.println("Sum of" +num+ "is=" +sumDigits(num));
    }
    public static int sumDigits(int number){
        if (number < 10){
            return -1;
        }
        int sumDigits=0;
        // convert number to string
        String numberTostring = Integer.toString(number);
        //map through all char at the string
        for (char c:numberTostring.toCharArray() ){
            //convert the char to number again
            sumDigits +=Integer.parseInt(String.valueOf(c));
        }
        return  sumDigits;
    }
}
