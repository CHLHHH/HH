import java.math.BigDecimal;
import java.util.Scanner;

import java.text.DecimalFormat;

/**
 * @author 崔海林
 * @create 2021-11-22 16:16
 */
public class SuiJiSuanShi {
    public static void main(String[] args) {
//        System.out.println((int) (Math.random() * 4 + 1));
        int jjcc = (int) (Math.random() * 4 + 1);
//        int jjcc = 4;
        int i = (int) (Math.random() * 90 + 10);
        int i1 = (int) (Math.random() * 90 + 10);
        switch (jjcc) {
            case 1:
                System.out.println(i + "+" + i1 + "=");
                int jg1 = new Scanner(System.in).nextInt();
                if (jg1 == (i+i1)) {
                    System.out.println("正确");
                }else {
                    System.out.println("错误");
                }
                break;
            case 2:
                System.out.println(i + "-" + i1 + "=");
                int jg2 = new Scanner(System.in).nextInt();
                if (jg2 == (i-i1)) {
                    System.out.println("正确");
                }else {
                    System.out.println("错误");
                }
                break;
            case 3:
                System.out.println(i + "*" + i1 + "=");
                int jg3 = new Scanner(System.in).nextInt();
                if (jg3 == (i*i1)) {
                    System.out.println("正确");
                }else {
                    System.out.println("错误");
                }
                break;
//
            case 4:
                double q = (int) (Math.random() * 90 + 10);
                double q1 = (int) (Math.random() * 90 + 10);
                System.out.println((int)q + "/" + (int)q1 + "=  (结果保留两位小数)");
                double cs = q / q1;
                double jg4 = new Scanner(System.in).nextDouble();
//                double d = 114.1445543;
                cs = (double) Math.round(cs * 100) / 100;
                if ( jg4 == cs) {
                    System.out.println("正确");
                }else {
                    System.out.println("错误");
                }
                break;

        }
    }
}
