import java.util.*;

class Student {
    private String name;
    private int age;
    private String city;

    public Student(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String toString() {
        return name + " " + age + " " + city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}

public class P_05 {
    public static void main(String[] args) {
        Student st1 = new Student("Rohan", 20, "Kolkata");
        Student st2 = new Student("Rahul", 21, "Midnapore");
        Student st3 = new Student("Tanushree", 21, "Midnapore");

        Map map = new HashMap();

        map.put(1, st1);
        map.put(2, st2);
        map.put(3, st3);

        System.out.println(map);

        Set set = map.entrySet();
        Iterator itr = set.iterator();

        while (itr.hasNext()) {
//            System.out.println(itr.next());
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
