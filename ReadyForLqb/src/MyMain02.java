import java.util.ArrayList;

public class MyMain02 {
    public static void main(String[] args) {
        System.out.println(getNum(5));

    }
    public static int getNum(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);

        }
        int count = 1;
        for (int i = 0;list.size()!= 1;i++) {
            if (i == list.size()) {
                i = 0;
            }
            if (count % 3 == 0) {
                list.remove(i--);
            }
            count++;
        }
        return list.get(0);
    }
}