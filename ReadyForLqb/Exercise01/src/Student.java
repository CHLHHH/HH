/**
 * @author 崔海林
 * @create 2021-11-19 17:02
 */
public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private double sg;

    public Student(String name, int age, double sg) {
        this.name = name;
        this.age = age;
        this.sg = sg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSg() {
        return sg;
    }

    public void setSg(double sg) {
        this.sg = sg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sg=" + sg +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return  this.getAge() - o.getAge();
    }
}
