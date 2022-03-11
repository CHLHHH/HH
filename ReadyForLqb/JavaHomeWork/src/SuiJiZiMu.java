import java.util.Random;
import java.util.Scanner;

public class SuiJiZiMu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("需要多少位？");
        int nextInt = sc.nextInt();
        String s =Grt(nextInt);
        System.out.println(s);
//        System.out.println((char)(25 + 97));
//        System.out.println((char)(9 + 48));


    }
    public static String Grt(int length) {
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