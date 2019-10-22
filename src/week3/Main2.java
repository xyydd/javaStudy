package week3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a >= 0 && a <= 1000000) {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            int i = 0;
            if (a > 0) {
                while (a > 0) {
                    map.put(i, a % 10);
                    a = a / 10;
                    i++;
                }
                Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
                for (int j = i - 1, k = 0; j >= 0; j--, k++) {
                    int o = map.get(j) % 2;
                    int o2 = (j + 1) % 2;
                    if (o == o2) {
                        map2.put(k, 1);
                    } else {
                        map2.put(k, 0);
                    }
                }
                String s = "";
                for (int j = 0; j < i; j++) {
                    s += map2.get(j);
                }
                System.out.println(Integer.valueOf(s, 2));
            } else {
                System.out.println(0);
            }
        }
    }
}
