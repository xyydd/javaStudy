package week6;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Boolean r = true;
        String s = "";
        while (r) {
            String s2 = in.nextLine();
            if (s2.indexOf("END") >= 0) {
                r = false;
            } else {
                String s3 = s2.substring(s2.indexOf("$"), s2.indexOf("*"));
                int i2 = Integer.parseInt(s2.substring(s2.indexOf("*"), s2.length() - 1).replace("*", ""));
                System.out.println(s3);
                s = s2;
            }
        }
//        System.out.println(getTime(s));
    }
    public static String getTime (String s) {
        String res = "";
        String[] sArr = s.split("\\$");
        String s2 = sArr[sArr.length - 1];
        String[] sArr2 = s2.split(",");
        String s3 = sArr2[1];
        String hh = s3.substring(0, 2);
        int h = Integer.parseInt(hh);
        h = h + 8;
        if (h >= 24) {
            h = h - 24;
        }
        if (h < 10) {
            hh = "0" + h;
        } else {
            hh = h + "";
        }
        String mm = s3.substring(2, 4);
        String ss = s3.substring(4, 6);
        System.out.print(hh + ":" + mm + ":" + ss);
        return res;
    }
}
