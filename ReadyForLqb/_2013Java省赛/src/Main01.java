import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();


//        转10进制  括号里面的数字表示 8 转10 （也可以是 2 或 16）
        Long l1 = Long.valueOf(s, 2);
        System.out.println(l1);


//
//        Integer i = sc.nextInt();
//        //  10进制转  数字表示的进制
//        String ss = Long.toString(i, 16);
//        System.out.println(s.toUpperCase()); //转换后的16进制是小写  所以要加一个转换大写的方法 其他进制不用加

//        Integer integer = new Integer(i);
//        int i1 = Integer.valueOf(s, 16);
//        System.out.println(s);

//        System.out.println(s);
    }
}