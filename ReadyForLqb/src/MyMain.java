public class MyMain {

    static int count;

    public static void main(String[] args) {
        walk(0,0);
        System.out.println(count);
    }
    public static void walk(int step,int walkCount) {
        if (walkCount >= 3) {
            count++;
            return;
        }
        walk(step+1,walkCount+1);
        walk(step+2,walkCount+1);
    }
}