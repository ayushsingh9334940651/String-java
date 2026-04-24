import java.util.*;

public class BalancedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            if (n % 4 != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");

                // first half even
                int sumEven = 0;
                for (int i = 1; i <= n/2; i++) {
                    int val = 2 * i;
                    System.out.print(val + " ");
                    sumEven += val;
                }

                // second half odd (except last)
                int sumOdd = 0;
                for (int i = 1; i < n/2; i++) {
                    int val = 2 * i - 1;
                    System.out.print(val + " ");
                    sumOdd += val;
                }

                // last element
                int last = sumEven - sumOdd;
                System.out.print(last);

                System.out.println();
            }
        }
    }
}