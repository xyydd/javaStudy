package week2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        if (i <= 59 && i >= 11) {
            Map<Integer, String> str = new HashMap<Integer, String>();
            str.put(1, "unreadable");
            str.put(2, "barely readable, occasional words distinguishable");
            str.put(3, "readable with considerable difficulty");
            str.put(4, "readable with practically no difficulty");
            str.put(5, "perfectly readable");
            Map<Integer, String> str2 = new HashMap<Integer, String>();
            str2.put(1, "Faint signals, barely perceptible");
            str2.put(2, "Very weak signals");
            str2.put(3, "Weak signals");
            str2.put(4, "Fair signals");
            str2.put(5, "Fairly good signals");
            str2.put(6, "Good signals");
            str2.put(7, "Moderately strong signals");
            str2.put(8, "Strong signals");
            str2.put(9, "Extremely strong signals");
            int a = i % 10;
            int b = i / 10;
            if (b > 5) {
                b = 5;
            }
            if (a > 9) {
                a = 9;
            }
            System.out.println(str2.get(a) + ", " + str.get(b) + ".");
        }
    }
}
