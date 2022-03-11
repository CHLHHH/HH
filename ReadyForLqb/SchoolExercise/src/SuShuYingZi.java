import java.util.Scanner;

/**
 * @author 崔海林
 * @create 2021-11-22 11:10
 */
public class SuShuYingZi {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.print(i + ",");
                n /= i;
                i = 1;
            }

        }
        System.out.println(n);
    }
}
