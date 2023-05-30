package homework_week3;

import java.util.Scanner;

public class P2_MinAndMaxInputChallenge {
    public static void main(String[] args){
        minAndMax();

    }
    public static void minAndMax(){
        Scanner Scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;

        while (true){
            System.out.println("Enter number:");

            boolean isAnInt=Scanner.hasNextInt();

            if (isAnInt){
                int number = Scanner.nextInt();

                if (number > max){
                    max = number;

                }
                if (number<min){
                    min = number;

                }

            }else {
                System.out.println("Invalid Number");
                break;
            }
            Scanner.nextLine();

        }
        System.out.println("Max="+max+"and =" +min);
        Scanner.close();
    }
}
