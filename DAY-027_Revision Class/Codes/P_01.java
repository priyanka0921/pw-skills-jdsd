import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int age;
    int marks;

    public Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMarks() {
        return marks;
    }

    public String toString() {
        return "" + name + " : " + age + " : " + marks;
    }


    // only use when target class is accessible
    @Override
    public int compareTo(Student a) {
        if (this.age > a.age) {
            return 1;
        } else {
            return -1;
        }
    }


}

public class P_01 {
    public static void main(String[] args) {

        Student s1 = new Student("Name-1", 21, 99);
        Student s2 = new Student("Name-2", 19, 95);
        Student s3 = new Student("Name-3", 23, 96);

        // comparator
//        Comparator<Student> compareStudent = (Student a, Student b) -> {
//            if(a.age > b.age){
//                return 1;
//            }
//            else {
//                return -1;
//            }
//        };

        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

//        studentList.sort(compareStudent);

        Collections.sort(studentList);
        System.out.println(studentList);

    }
}
