import java.util.HashMap;
import java.util.Hashtable;
import java.util.WeakHashMap;

class Employee {
    private final String name;
    private final int empId;

    public Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    @Override
    public String toString() {
        return empId + "";
    }

    @Override
    protected void finalize(){
        System.out.println("Clean up work by GC before de allocating memory  form heap");
    }

}

public class P_07 {
    public static void main(String[] args) {
        Employee e = new Employee("Rahul", 171);

//        HashMap hm = new HashMap();
        WeakHashMap hm = new WeakHashMap();
        hm.put(e, "Hyder");

        System.out.println(hm);

        e = null; // eligible for garbage collection
        System.gc(); // invoking garbage collector manually

        System.out.println(hm);

        System.out.println("Last statement");



    }

}
