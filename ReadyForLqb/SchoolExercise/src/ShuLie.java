public class ShuLie {
    public static void main(String[] args) {
        double fz = 1;
        double fm = 1;
        double fs = fz / fm;
        double sn = 0;
        for (int i = 0; i < 30; i++) {
            double qianfz = fz;
            double qianfm = fm;
            fz = qianfz + qianfm;
            fm = qianfz;
            fs = fz / fm;
            sn += fs;

        }
        System.out.println(sn);
    }
}