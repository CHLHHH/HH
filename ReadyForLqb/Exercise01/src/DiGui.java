/**
 * @author 崔海林
 * @create 2021-11-28 9:58
 */
public class DiGui {
    public static void main(String[] args) {
        int k = f(10000,3);
        System.out.println(k);
    }
    public static int f(int n,int m) {
        if (n < m) return 0;
        if (n == m) return 1;
        if (m == 0) return 1;

        return f(n - 1,m -1) + f(n - 1,m);
    }
}
