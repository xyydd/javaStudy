package week4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n <= 100000 && n >= -100000) {
            String result = "";
            Map<Integer, String> map = new HashMap<Integer, String>();
            map.put(0, "ling");
            map.put(1, "yi");
            map.put(2, "er");
            map.put(3, "san");
            map.put(4, "si");
            map.put(5, "wu");
            map.put(6, "liu");
            map.put(7, "qi");
            map.put(8, "ba");
            map.put(9, "jiu");
            if (n > 0 || n < 0) {
                int m = n;
                if (m < 0) {
                    m = -m;
                }
                while (m > 0) {
                    int i = 0;
                    i = m % 10;
                    m = m / 10;
                    if (result.equals("")) {
                        result = map.get(i);
                    } else {
                        result = map.get(i) + " " + result;
                    }
                }
                if (n < 0) {
                    result = "fu " + result;
                }
            } else {
                result = "ling";
            }
            System.out.println(result);
        }
    }
}
