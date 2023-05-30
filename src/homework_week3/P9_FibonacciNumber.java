package homework_week3;

public class P9_FibonacciNumber {
    public static void main(String[] args) {
        fibonacciNum();

    }
    public static void fibonacciNum(){
        int n =8, firstTerm =1, secondTerm=1;
        System.out.println("Fiboncci series till"+n+"terms:");

        for (int i=1; i <=n;++i){
            System.out.println(firstTerm+"");
            // compute the next term
            int nextTerm =firstTerm + secondTerm;
            firstTerm= secondTerm;
            secondTerm=nextTerm;
        }
    }

}
