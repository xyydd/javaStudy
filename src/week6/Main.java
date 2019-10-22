package week6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if (s.indexOf(".") == (s.length() - 1) && s.length() > 0) {
            System.out.print(getStringLength(s));
        } else {
            System.out.print("");
        }
    }
    public static String getStringLength (String s) {
        String res = "";
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String l = arr[i];
            if (l.length() > 0) {
                if (i < arr.length - 1) {
                    if (res.equals("")) {
                        res = l.length() + "";
                    } else {
                        res = res + " " + l.length();
                    }
                } else {
                    if (res.equals("")) {
                        if (l.length() - 1 != 0) {
                            res = (l.length() - 1) + "";
                        }
                    } else {
                        res = res + " " + (l.length() - 1);
                    }
                }
            }
        }
        return res;
    }
}
