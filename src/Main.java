import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//      TASK 1
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();

        int result = SumOfSquares(a);
        System.out.println("Sum of squares is " + result);
    }

//  TASK 1
    public static int SumOfSquares(int n){
        if (n == 0){
            return 0;
        }
        return SumOfSquares(n-1) + n*n;
    }



}