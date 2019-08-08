package week1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int F = in.nextInt();
        double c1 = (F - 32) / 9.0 * 5.0;
        int result = (int)c1;
        System.out.println(result);
    }
}
