import java.util.Scanner;
public class ZiMuTuXing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = Getsz(m);
        int head = 0;
        int end = m ;
        System.out.println(s);
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        int end2 = m - 1;
        int head1 = m - 2;
        for (int i = 0; i < n - 1; i++) {
            if ( n <= 8 ) {
                String s3 = s.substring(head, m - 1);
                String s4 = sb.substring(head1, end2);
                head1--;
                m--;
                System.out.print(s4);
                System.out.println(s3);
            }else  {
                String s3 = s.substring(head, m - 1);
                String s4 = sb.substring(head1, end2);
                head1--;
                m--;
                System.out.print(s4);
                System.out.println(s3);
            }
        }
//        System.out.println(s);
    }


    public static String Getsz(int m) {
        char[] arr = new char[m];
        char c = 'A';
        for (int i = 0; i < m; i++) {
            arr[i] = c;
            c++;
//            System.out.print(arr[i]);
        }
         return new String(arr);
    }
}


