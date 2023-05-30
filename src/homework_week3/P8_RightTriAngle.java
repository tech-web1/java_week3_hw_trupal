package homework_week3;

import java.util.Scanner;

public class P8_RightTriAngle {
    public static Scanner sc =new Scanner(System.in);

    public static void main(String[] args) {
        rightTriangle();

    }
    public static void rightTriangle(){
        System.out.println("Enter raws:");
        int raws = sc.nextInt();

        int a, b;
        for (a=0;a<raws; a++){
            for (b=0; b <=a;b++){
                System.out.println("0");
            }
            System.out.println();
        }
    }
}
