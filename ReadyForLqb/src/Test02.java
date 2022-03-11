import java.util.*;

public class Test02 {

    static int count = 0;

    public static void main(String[] args) {

        getStep(0,0);
        System.out.println(count);
    }

    public static void getStep(int step, int walkcount) {
        if (step > 5) {
            return;
        }
        if (step == 5 && walkcount % 2 == 0) {
            count++;
            return;
        }
        getStep(step + 1, walkcount + 1);
        getStep(step + 2, walkcount + 1);
    }

}