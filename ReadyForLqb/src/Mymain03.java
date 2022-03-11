import java.util.*;

/**
 * @author 崔海林
 * @create 2021-11-17 18:52
 */
public class Mymain03 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedHashSet<Integer> list1 = new LinkedHashSet<>();
        list.add(11);
        list.add(12);
        list.add(11);
        list.add(31);
        list.add(0);
        System.out.println(list);
        System.out.println("******");
        list1.add(11);
        list1.add(12);
        list1.add(11);
        list1.add(31);
        list1.add(0);
        System.out.println(list1);

    }
}