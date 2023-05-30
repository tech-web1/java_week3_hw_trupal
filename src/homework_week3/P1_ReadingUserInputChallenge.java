package homework_week3;

import java.util.Scanner;

public class P1_ReadingUserInputChallenge {
    public static void main(String[] args) {
        UserInputChallenge();

    }
    public static void UserInputChallenge(){
        UserInputChallenge();
        Scanner scanner=new Scanner(System.in);

        int count=1;
        int sum =0;

        while (count <=10){
            System.out.println("Enter number #"+count);

            boolean validateNumber= Scanner.hasNextInt();
            if (validateNumber){
                int number=Scanner.nextInt();
                sum+=number;
                count++;

            }else {
                System.out.println("Invalid number");
            }
            //Always return new userInput
            Scanner.nextLine();

        }
        System.out.println("sum of all number="+sum);
        Scanner.close();

    }

}
