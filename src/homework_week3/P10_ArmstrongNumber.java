package homework_week3;

import java.util.Scanner;

public class P10_ArmstrongNumber {
    public static Scanner Scanner=new Scanner(System.in);

    public static void main(String[] args) {
        armstrangNum();
    }
    public static void armstrangNum(){
        int temp,total=0;
        System.out.println("Enter Number: ");
        int num =Scanner.nextInt();
        int number =num;

        for (; number !=0; number/=10){
            temp =number %10;
            total =total + temp *temp*temp;

        }
        if (total==num){
            System.out.println(num+"is an Armstrong number");

        }else{
            System.out.println(num+ "is not an Armstrong number");
        }
    }
}
