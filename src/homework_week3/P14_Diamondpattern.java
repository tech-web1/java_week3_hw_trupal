package homework_week3;

public class P14_Diamondpattern {
    public static void main(String[] args) {
        diamond();
    }
    public static void diamond(){
        int number =7;
        int m=3;
        int n;
        while (n <=number){
            n=1;
            while (n++<=m*2-1){
                System.out.println("*");
            }
            System.out.println();
            m++;

        }
        m=number-1;

        while (m > 0){
            n=1;
            while (n++ <=number-m){

                System.out.println("");
            }
            n=1;
            while (n++ <=m*2-1){
                System.out.println("*");
            }
            System.out.println();
            m--;
        }
    }
}
