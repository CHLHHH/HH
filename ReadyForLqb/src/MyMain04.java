import java.util.Scanner;

public class MyMain04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        //  10进制转 数字表示的进制
//        String s = Integer.toString(i, 8);
//        System.out.println(s.toUpperCase());
        //方法是字符串表示的进制  转10进制
//        String i1 = i.toString();
//        int l1 = Integer.parseInt(i1, 10);
//        System.out.println(l1);
//        System.out.println(Integer.MAX_VALUE);

        Integer integer = new Integer(s);
        int i1 = Integer.valueOf(s, 16);
        System.out.println(s);

//        System.out.println(s);
    }
}