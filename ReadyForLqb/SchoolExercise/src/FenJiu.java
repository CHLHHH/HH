/**
 * @author 崔海林
 * @create 2021-11-22 20:38
 *
 * 本题目的要求是，请你编写程序，由用户输入：各个容器的容量，开始的状态，和要求的目标油量，
 * 程序则通过计算输出一种实现的步骤（不需要找到所有可能的方法）。如果没有可能实现，则输出：“不可能”。
 */
import java.util.ArrayList;
import java.util.Scanner;

public class FenJiu {
    public static ArrayList<String> set = new ArrayList<String>();
    public static int[] maxN = new int[3];
    public static int[] N = new int[3];
    public static int ans;
    public static int count = 0;

    //某start瓶向end瓶中倒
    public void getOnetoAnother(int start, int end) {
        if(N[start] == 0)
            return;
        if(maxN[end] > N[end]) {
            int low = maxN[end] - N[end];
            int temp1 = N[start], temp2 = N[end];
            if(low >= N[start]) {
                N[end] = N[end] + N[start];
                N[start] = 0;
            } else {
                N[end] = maxN[end];
                N[start] = N[start] - low;
            }
            StringBuffer s = new StringBuffer("");
            s.append(N[0]);
            s.append(",");
            s.append(N[1]);
            s.append(",");
            s.append(N[2]);
            if(!set.contains(s.toString())) {
                set.add(s.toString());
                count++;
            } else {
                N[start] = temp1;
                N[end] = temp2;
            }
        }
    }

    public boolean check() {
        if(N[0] == ans || N[1] == ans || N[2] == ans) {
            for(String s : set)
                System.out.println(s);
            return true;
        }
        return false;
    }

    public void getResult() {
        int max = Math.max(maxN[0], Math.max(maxN[1], maxN[2]));
        if(ans > max) {
            System.out.println("不可能");
            return;
        }
        while(true) {
            int temp = count;
            //A瓶向B瓶倒
            getOnetoAnother(0, 1);
            if(check())
                break;
            //B瓶向C瓶倒
            getOnetoAnother(1, 2);
            if(check())
                break;
            //C瓶向A瓶倒
            getOnetoAnother(2, 0);
            if(check())
                break;
            //A瓶向C瓶倒
            getOnetoAnother(0, 2);
            if(check())
                break;
            //C瓶向B瓶倒
            getOnetoAnother(2, 1);
            if(check())
                break;
            //B瓶向A瓶倒
            getOnetoAnother(1, 0);
            if(check())
                break;
            temp = count - temp;
            if(temp == 0) {
                System.out.println("不可能");
                return;
            }
        }
    }

    public static void main(String[] args) {
        FenJiu test = new FenJiu();
        Scanner in = new Scanner(System.in);
        String S = in.next();
        String[] arrayS = S.split(",");
        for(int i = 0;i < 3;i++)
            maxN[i] = Integer.valueOf(arrayS[i]);
        for(int i = 3;i < 6;i++)
            N[i - 3] = Integer.valueOf(arrayS[i]);
        ans = Integer.valueOf(arrayS[6]);
        StringBuffer s = new StringBuffer("");
        s.append(N[0]);
        s.append(",");
        s.append(N[1]);
        s.append(",");
        s.append(N[2]);
        set.add(s.toString());
        test.getResult();
    }
}
