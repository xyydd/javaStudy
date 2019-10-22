package week3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Integer, Integer> arr = new HashMap<Integer, Integer>();
        int i = 0;
         do {
            int a = in.nextInt();
            arr.put(i, a);
            i++;
        } while (arr.get(i - 1) != -1);
        int o = 0; // 偶数
        int b = 0; // 奇数
        for (int j = 0; j <= i; j++) {
            if (arr.get(j) != -1) {
                if (arr.get(j) % 2 == 0) {
                    o++;
                } else {
                    b++;
                }
            } else {
                System.out.println(b + " " + o);
                return;
            }
        }
    }
}
