
import java.util.*;

public class fib {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();

        pattern(a);

        int fibino = n.nextInt();

        int[] fibResult = fibo(fibino);
        for (int e : fibResult) {
            System.out.print(e + " ");
        }
    }

    public static void pattern(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int[] fibo(int fibino) {
        int[] arr = new int[fibino];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < fibino; i++) {
            arr[i] = (i - 1) + (i - 2);
        }
        return arr;
    }

}
