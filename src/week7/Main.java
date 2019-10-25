package week7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String res = n + "=";
        if (!isPrime(n)) {
            System.out.println(res + breakDown(n));
        } else {
            System.out.println(n + "=" + n);
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
    public static String breakDown (Integer n) {
        if (isPrime(n)) {
            return n + "";
        }
        String res = "";
        for (int i = 2; i < n; i++) {
            int a = n % i;
            if (a == 0) {
                return i + "x" + breakDown(n / i);
            }
        }
        return res;
    }
}
