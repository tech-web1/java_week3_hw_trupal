package homework_week3;

public class P15_LeftTriAngle {
    public static void main(String[] args) {
        leftTriangle();
    }
    public static void leftTriangle(){
        int raws=5;
        for (int i=1;i<=raws;i++ ){
            for (int i=1;i<=raws-i;i++){
                System.out.println(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
