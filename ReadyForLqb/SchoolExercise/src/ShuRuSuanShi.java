import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author 崔海林
 * @create 2021-11-22 15:51
 */
public class ShuRuSuanShi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.contains("+")) {
            String[] strsz = s.split("\\+");
            Integer i1 = Integer.valueOf(strsz[0]);
            Integer i2 = Integer.valueOf(strsz[1]);
            System.out.println(strsz[0] + "+" + strsz[1] + "=" + (i1 + i2));
        }else if (s.contains("*")) {
            String[] strsz = s.split("\\*");
            Integer i1 = Integer.valueOf(strsz[0]);
            Integer i2 = Integer.valueOf(strsz[1]);
            System.out.println(strsz[0] + "*" + strsz[1] + "=" + (i1 * i2));
        }else if (s.contains("/")) {
            String[] strsz = s.split("/");
            Double i1 = Double.valueOf(strsz[0]);
            Double i2 = Double.valueOf(strsz[1]);
            if (i2 == 0.0) {
                System.out.println("除数不能为0");
            }else {
                System.out.println(strsz[0] + "/" + strsz[1] + "=" + (i1 / i2));
            }
        }else if (s.contains("-")) {
            String[] strsz = s.split("-");
            Integer i1 = Integer.valueOf(strsz[0]);
            Integer i2 = Integer.valueOf(strsz[1]);
            System.out.println(strsz[0] + "-" + strsz[1] + "=" + (i1 - i2));
        }
    }
}
