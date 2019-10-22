package week5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] res = new int[200][2];
        Map<Integer, String> m = new HashMap<Integer, String>();
        int j = 0;
        int i = 0;
        while (j != 2) {
            String s = in.nextLine();
            if (!s.equals("")) {
                String[] strings = s.split(" ");
                int[] arr = {Integer.parseInt(strings[0]), Integer.parseInt(strings[1])};
                res[i] = arr;
                i++;
                if (arr[0] == 0) {
                    j++;
                }
            }
        }
        for (i = 0; i < res.length; i++) {
            if (res[i][0] != 0 || res[i][1] != 0) {
                if (res[i][1] != 0) {
                    if (!m.containsKey(res[i][0])) {
                        if (res[i][0] != 0) {
                            if (res[i][1] < 0 && res[i][0] < 0) {
                                m.put(res[i][0], (-res[i][1]) + "x" + (-res[i][0]));
                            } else if (res[i][0] < 0) {
                                m.put(res[i][0], (-res[i][1]) + "x" + (-res[i][0]));
                            } else {
                                m.put(res[i][0], res[i][1] + "x" + (res[i][0] == 1 ? "" : res[i][0]));
                            }
                        } else {
                            m.put(res[i][0], res[i][1] + "");
                        }
                    } else {
                        if (res[i][0] != 0) {
                            String p = m.get(res[i][0]);
                            String[] ps = p.split("x");
                            int[] o = new int[2];
                            int q = 0;
                            if (res[i][0] != 1) {
                                o[0] = Integer.parseInt(ps[1]);
                                o[1] = Integer.parseInt(ps[0]);
                            } else {
                                o[0] = 1;
                                o[1] = Integer.parseInt(ps[0]);
                            }

                            if (res[i][1] < 0 && res[i][0] < 0) {
                                q = o[1] - res[i][1];
                            } else {
                               q  = o[1] + res[i][1];
                            }
                            if (q != 0) {
                                m.put(res[i][0], q + "x" + (o[0] == 1 ? "" : o[0]));
                            } else {
                                m.remove(res[i][0]);
                            }
                        } else {
                            int p = Integer.parseInt(m.get(res[i][0]));
                            m.put(res[i][0], (p + res[i][1]) + "");
                        }
                    }
                }
            }
        }
        String r = "";
        for (String val : m.values()) {
            System.out.println(r);
            if (!r.equals("")) {
                if (r.indexOf("-") == 0) {
                    r = val + r;
                } else {
                    r = val + "+" + r;
                }
            } else {
                r = val;
            }
        }
        if (r.equals("")) {
            System.out.println(0);
        } else {
            System.out.println(r);
        }
    }
}
