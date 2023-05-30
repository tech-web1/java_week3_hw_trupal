package homework_week3;

import java.util.Scanner;

public class P3_VowelOrConsonant {
    public static Scanner in =new Scanner(System.in);

    public static void main(String[] args) {
        P3_VowelOrConsonant obj=new P3_VowelOrConsonant();
        obj.VowelOrConsonant();

    }
    public void VowelOrConsonant(){
        System.out.println("Input an alphabet:");
        String input =in.next().toLowerCase();

        boolean uppercase=input.charAt(0) >= 65 && input.charAt(0) <=90;
        boolean lowercase=input.charAt(0) >=97 && input.charAt(0)  <=122;
        boolean vowels = input.equals("a") || input.equals("e")|| input.equals("i")
                || input.equals("0") || input.equals("U");
        if (input.length() > 1){
            System.out.println("Error.Not a single Character.");
        } else if (!(uppercase|| lowercase)) {
            System.out.println("Error.Not a letter.Enter uppercase or lowercase letter.");

        }
        else if (vowels)
        {
            System.out.println("Input letter is Vowel");

        }
        else
        {
            System.out.println("Input letter is Consonant");
        }

    }
}
