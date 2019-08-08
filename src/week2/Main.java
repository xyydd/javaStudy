package week2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 初始化
        Scanner in = new Scanner(System.in);
        // 投币
        System.out.print("请投币：");
        int amount = in.nextInt();
        if (amount >= 10) {
            // 打印车票
            System.out.println("****************");
            System.out.println("* Java 铁路专线 *");
            System.out.println("*  票价 10 元   *");
            System.out.println("****************");
            // 计算打印找零
            System.out.println("找零：" + (amount - 10));
        }
    }
}
