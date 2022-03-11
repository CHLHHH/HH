import java.util.Scanner;

public class JiSuanQi {

    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择你要做什么运算：1.加法运算；2.减法运算；3.乘法运算；4.除法运算");
        int i = sc.nextInt();
        jsq1(i);


    }

    public static void jsq1(int s) {
        Scanner sc = new Scanner(System.in);
        switch (s) {
            case 1:
                for (int i = 1; i <= 10; i++) {
                    int n1 = (int) (Math.random() * 10);
                    int n2 = (int) (Math.random() * 10);
                    System.out.println("第" + i + "题：" + n1 + "+" + n2 + "=");
                    int i1 = sc.nextInt();
                    if (i1 == (n1 + n2)) {
                        count++;
                    }
                }
//                System.out.println(sum);
                if (count == 10) {
                    System.out.println("恭喜你，正确率在 90% 以上进入中级难度");
                    System.out.println("请选择你要做什么运算：1.加法运算；2.减法运算；3.乘法运算；4.除法运算");
                    int i = sc.nextInt();
                    jsq2(i);
                    break;
                }
                System.out.println("选手答对题数：" + count);
                break;
            case 4:
                for (int i = 1; i <= 10; i++) {

                    int n1 = (int) (Math.random() * 9 + 1);
                    int n2 = (int) (Math.random() * 9 + 1);
                    if (!(n1 % n2 == 0)) {
                        i = i - 1;
                        continue;
                    }
                    System.out.println("第" + i + "题：" + n1 + "/" + n2 + "=");
                    int i1 = sc.nextInt();
                    if (i1 == (n1 / n2)) {
                        count++;
                    }
                }
//                System.out.println(sum);
                if (count == 10) {
                    System.out.println("恭喜你，正确率在 90% 以上进入中级难度");
                    System.out.println("请选择你要做什么运算：1.加法运算；2.减法运算；3.乘法运算；4.除法运算");
                    int i = sc.nextInt();
                    jsq2(i);
                    break;
                }
                System.out.println("选手答对题数：" + count);
                break;
            default:
                System.out.println("请选择1-4里面的运算,没有其他运算哦！");
                int e = sc.nextInt();
                jsq1(e);


        }

    }

    public static void jsq2(int s) {
        Scanner sc = new Scanner(System.in);
        switch (s) {
            case 1:
                for (int i = 1; i <= 10; i++) {
                    int n1 = (int) (Math.random() * 90 + 10);
                    int n2 = (int) (Math.random() * 90 + 10);
                    System.out.println("第" + i + "题：" + n1 + "+" + n2 + "=");
                    int i1 = sc.nextInt();
                    if (i1 == (n1 + n2)) {
                        count++;
                    }
                }
                if (count >= 19) {
                    System.out.println("恭喜你，正确率在 80% 以上进入高级难度");
                    System.out.println("请选择你要做什么运算：1.加法运算；2.减法运算；3.乘法运算；4.除法运算");
                    int i = sc.nextInt();
                    jsq3(i);
                    break;
                }
                System.out.println("选手答对题数：" + (count));
                break;
            case 4:
                for (int i = 1; i <= 10; i++) {

                    int n1 = (int) (Math.random() * 90 + 10);
                    int n2 = (int) (Math.random() * 90 + 10);
                    if (!(n1 % n2 == 0)) {
                        i = i - 1;
                        continue;
                    }
                    System.out.println("第" + i + "题：" + n1 + "/" + n2 + "=");
                    int i1 = sc.nextInt();
                    if (i1 == (n1 / n2)) {
                        count++;
                    }
                }
//                System.out.println(sum);
                if (count > 18) {
                    System.out.println("恭喜你，正确率在 80% 以上进入高级难度");
                    System.out.println("请选择你要做什么运算：1.加法运算；2.减法运算；3.乘法运算；4.除法运算");
                    int i = sc.nextInt();
                    jsq3(i);
                    break;
                }
                System.out.println("选手答对题数：" + count);
                break;
            default:
                System.out.println("请选择1-4里面的运算,没有其他运算哦！");
                int e = sc.nextInt();
                jsq2(e);


        }

    }

    public static void jsq3(int s) {
        Scanner sc = new Scanner(System.in);
        switch (s) {
            case 1:
                for (int i = 1; i <= 10; i++) {
                    int n1 = (int) (Math.random() * 900 + 100);
                    int n2 = (int) (Math.random() * 900 + 100);
                    System.out.println("第" + i + "题：" + n1 + "+" + n2 + "=");
                    int i1 = sc.nextInt();
                    if (i1 == (n1 + n2)) {
                        count++;
                    }
                }
                System.out.println("选手答对题数：" + (count));
                break;
            case 4:
                for (int i = 1; i <= 10; i++) {
                    int n1 = (int) (Math.random() * 900 + 100);
                    int n2 = (int) (Math.random() * 900 + 100);
                    if (!(n1 % n2 == 0)) {
                        i = i - 1;
                        continue;
                    }
                    System.out.println("第" + i + "题：" + n1 + "/" + n2 + "=");
                    int i1 = sc.nextInt();
                    if (i1 == (n1 / n2)) {
                        count++;
                    }
                }
                System.out.println("选手答对题数：" + (count));
                break;
            default:
                System.out.println("请选择1-4里面的运算,没有其他运算哦！");
                int e = sc.nextInt();
                jsq3(e);



        }


    }
}