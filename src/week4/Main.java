package week4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        if (n > 0 && n <= m && m <= 200) {
            int i = 0, num = 1, result = 0;
            while (i <= m) {
                if (isPrime(num)) {
                    if (i >= n) {
                        result += num;
                    }
                    i++;
                }
                num++;
            }
            System.out.println(result);
        }
    }
    public static Boolean isPrime (Integer a) {
        Boolean res = true;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                res = false && res;
            }
        }
        return res;
    }
}
