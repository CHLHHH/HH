import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//5
//        2 6 4 10 20
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        int hs = m;
        int ls = n;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] yccz = yccz(arr);
        int[] ints = quShanglie(yccz);
        System.out.println(ints);


    }
    public static int[][] yccz(int[][] arr) {
        while (true) {
            int[] ints = quShanglie(arr);
            for (int i = 0; i < ints.length; i++) {
                System.out.print(ints[i]+" ");
            }
            int[][] shanlieHou = shanlie(arr);


            int[] ints1 = quZuoHang(shanlieHou);
            for (int i = 0; i < ints1.length; i++) {
                System.out.print(ints1[i]+" ");
            }
            int[][] shanHh = shanHang(shanlieHou);


            int[] ints3 = quXianglie(shanHh);
            for (int i = 0; i < ints3.length; i++) {
                System.out.print(ints3[i]+" ");
            }

            int[][] shanlieHg = shanYoulie(shanHh);


            int[] ints2 = quYouHang(shanlieHg);
            for (int i = 0; i < ints2.length; i++) {
                System.out.print(ints2[i]+" ");
            }

            int[][] ints4 = shanZuoHang(shanlieHg);
            return ints4;




        }
    }
    public static int[] quYouHang(int[][] arr) {
        int l = arr[0].length;
        int[] arr1 = new int[l];
        for (int i = arr[0].length-1,k=0; i >= 0; i--,k++) {
            arr1[k] = arr[0][i];
        }
        return arr1;
    }
    public static int[] quXianglie(int[][] arr) {
        int h = arr.length;
        int[] arr1 = new int[h];
        for (int i = arr.length-1,j=arr.length-1,k=0; i >= 0; i--,k++) {
            arr1[k] = arr[i][j];
        }
        return arr1;
    }


    public static int[][] shanZuoHang(int[][] arr) {
        int m = arr.length-1;
        int n = arr[0].length;
        int[][] sl = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sl[i][j] = arr[i+1][j];
            }
        }
        return sl;
    }
    public static int[][] shanHang(int[][] arr) {
        int m = arr.length-1;
        int n = arr[0].length;
        int[][] sl = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sl[i][j] = arr[i][j];
            }
        }
        return sl;
    }

    public static int[] quZuoHang(int[][] arr) {
        int l = arr[0].length;
        int[] arr1 = new int[l];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[arr.length-1][i];
        }
        return arr1;
    }
    public static int[][] shanlie(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length-1;
        int[][] sl = new int[m][n];
        for (int i = 0; i < sl.length; i++) {
            for (int j = 0; j < sl[i].length; j++) {
                sl[i][j] = arr[i][j+1];
            }
        }
        return sl;
    }
    public static int[][] shanYoulie(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length-1;
        int[][] sl = new int[m][n];
        for (int i = 0; i < sl.length; i++) {
            for (int j = 0; j < n; j++) {
                sl[i][j] = arr[i][j];
            }
        }
        return sl;
    }
    public static int[] quShanglie(int[][] arr) {
        int h = arr.length;
        int[] arr1 = new int[h];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i][0];
        }
        return arr1;
// ajfkllaf
    }
}
