public class ChouZiFu {
    public static void main(String[] args) {

        String s = "name=zhangsan age=18 classNo=090728";
        String s1 = "zhangsan";
        String s2 = "age=18";
        String s3 = "classNo=090728";
        System.out.println(cq(s, s1));
        System.out.println(cq(s, s2));
        System.out.println(cq(s, s3));
    }
    public static String cq(String s,String s1) {
        int length = s1.length();
        int i = s.indexOf(s1);
        String s2 = s.substring(i, i + length);
        return s2;
    }
}
