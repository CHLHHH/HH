import java.util.Scanner;

/**
 * @author 崔海林
 * @create 2021-11-25 21:40
 */
public class DuiCheng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        StringBuilder s2 = sb.reverse();
        String s1 = s2.toString();
//        System.out.println(s1);
        if (s1.equals(s)) {
            System.out.println(s + "是对称字符");
        }else {
            System.out.println(s + "不是对称字符");
        }

//        if (s.length() % 2 == 0) {
//            char[] chars = s.toCharArray();
//
//        }
    }
}
