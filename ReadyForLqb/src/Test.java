import java.util.LinkedList;
import java.util.Scanner;

public class Test {
    static int count = 0;
    static boolean flag = true;
    //声明一个链式List 可做为一个队列来用，储存分酒的过程。
    static LinkedList<String> list = new LinkedList<String>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一组数据：（A,B,C,a,b,c,t --> A> B> C）");
        String st = sc.next();

        String[] array = st.split(",");
        int A, B, C, a, b, c, t;
        A = Integer.parseInt(array[0]);
        B = Integer.parseInt(array[1]);
        C = Integer.parseInt(array[2]);
        a = Integer.parseInt(array[3]);
        b = Integer.parseInt(array[4]);
        c = Integer.parseInt(array[5]);
        t = Integer.parseInt(array[6]);

        getCondition(a, b, c, A, B, C, t);

    }
    /**
     *
     * @param a 大桶初始酒量
     * @param b 中桶初始酒量
     * @param c 小桶初始酒量
     * @param A 大桶容量
     * @param B 中桶容量
     * @param C 小桶容量
     * @param t 目标酒量
     */
    public static void getCondition(int a, int b, int c, int A, int B, int C,
                                    int t) {

        //递归结束条件，假设超过1000次则视为不可能或遇到目标酒量是停止递归。
        if (a == t || b == t || count >= 1000) {
            if (count >= 1000) {
                System.out.println("不可能");
                flag = false;
            }
            return;
        }


        if (c == 0) {   //5.若小桶被倒空，则无论中瓶子是否满，应马上从中瓶子倒入小桶
            if (b >= C) {
                c = C;
                b = b - C;
            } else if (b > 0) {
                c = b;
                b = 0;
            } else {
                b = B;
                a = a - B;
            }
        } else if (c == C) {    //4. 小桶只有在已经装满的情况下才能倒入大桶
            c = 0;
            a = a + C;
        } else {            //其他情况下，让中桶酒倒入小桶。
            if (b == 0) {
                b = b + B;
                a = a - B;
            } else {
                int n = b + c;
                if (n > C) {
                    c = C;
                    b = n - C;
                } else {
                    b = 0;
                    c = n;
                }
            }
        }
        count++;
        String st = a + "," + b + "," + c;
        list.add(st);
        getCondition(a, b, c, A, B, C, t);
        if (flag)
            System.out.println(list.removeFirst());
    }

}