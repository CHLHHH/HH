import javax.lang.model.element.VariableElement;
import java.util.Scanner;
import java.util.TreeSet;

public class TongJi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你要判断的字符：");
        String s = sc.nextLine();
        int sum = 0;
        for (char i = '0'; i <= '9'; i++) {
            sum = getSum(s, i);
            System.out.println(i + "有: " + sum + "个");
        }
    }
    public static int getSum(String sb,char n) {
        int sum = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == n) {
                sum++;
            }
        }
        return sum;
    }
}