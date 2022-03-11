import java.util.Random;
import java.util.Scanner;

/**
 * @author 崔海林
 * @create 2021-11-26 12:52
 */
public class ZhaoXiFuChuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字符串：");
        String s = sc.next();
        System.out.println("输入你要判断的子字符串：");
        String s2 = sc.next();
        System.out.println(s2 + "的位置在");
        StringBuilder sb = new StringBuilder(s);
        boolean bj = true;
        while (true) {
            if (sb.indexOf(s2) == -1) {
                if (bj) {
                    System.out.println("不包含此字符串");
                }
                break;
            }else {
                bj = false;
                int i = sb.indexOf(s2);
                System.out.print(i + "\t");
                sb = sb.replace(i,i+s2.length(),Grt(s2.length(),s2));
            }

        }
    }
    public static String Grt(int length,String s2) {
      String zgc = hh(s2.length());
        while (true) {
            if (zgc.equals(s2)) {
                 zgc = hh(s2.length());
            }else {
                break;
            }
        }
        return zgc;
    }
    public static String hh(int length) {
        String zgc = "";
        Random r = new Random();
        for (int j = 0; j < length; j++) {
            int i = r.nextInt(3);
            if (i == 1) {
                zgc += (char)(r.nextInt(26) + 97);
            }else if (i == 2) {
                zgc += (char)(r.nextInt(26) + 65);
            }else {
//                String.valueOf(r.nextInt(10)) 数字转字符 数字是0就变成字符是0
                zgc += (char)(r.nextInt(10) + 48);
            }
        }
        return zgc;
    }
}
