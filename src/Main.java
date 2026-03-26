import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//      TASK 1
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();

        int result = SumOfSquares(a);
        System.out.println("Sum of squares is " + result);


//      TASK 2
        Scanner num2 = new Scanner(System.in);
        int N = 6;
        int[] arr = new int[N];

        System.out.println("Fill in numbers for array: ");
        for (int i = 0; i < N; i++){
            arr[i] = num2.nextInt();
        }

        System.out.println("What are first n you want to sum: ");
        int n = num2.nextInt();

        int result2 = SumOfFirstNelement(arr, n);
        System.out.println("Sum of first n elements = " + result2);



//      TASK 3
        Scanner num3 = new Scanner(System.in);

        System.out.println("Number: ");
        int b = num3.nextInt();

        System.out.println("Power: ");
        int n2 = num3.nextInt();

        int result3 = (int) SumOfNpower(b, n2);
        System.out.println("Sum of n power of b: " + result3);
    }

//  TASK 1
    public static int SumOfSquares(int n){
        if (n == 0){
            return 0;
        }
        return SumOfSquares(n-1) + n*n;
    }


    //  TASK 2
    public static int SumOfFirstNelement (int[] arr, int n) {
        if (n <= 0){
            return 0;
        }
        return SumOfFirstNelement(arr, n-1) + arr[n-1];
    }


    //  TASK 3
    public static double SumOfNpower(int b, int n){
        if (n < 0) {
            return 0;
        }
        return SumOfNpower(b, n-1) + Math.pow(b, n);
    }
}