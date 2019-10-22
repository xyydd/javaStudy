package week2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int BJT = in.nextInt();
    if (BJT <= 2359 && BJT >= 0) {
      int BJTh = BJT / 100;
      int BJTm = BJT % 100;
      if (BJTh == 0) {
        BJTh = 24 - 8;
      } else if (BJTh < 8) {
        BJTh = 24 - (8 - BJTh);
      } else {
        BJTh = BJTh - 8;
      }
      if (BJTh == 0) {
        System.out.println(BJTm);
      } else {
        System.out.println(BJTh * 100 + BJTm);
      }
    }
  }
}
