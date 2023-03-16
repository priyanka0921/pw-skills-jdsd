interface Computer {
    void writingCode();
}

class Laptop implements Computer {
    public void writingCode() {
        System.out.println("Bulding apps on Laptop");
    }
}

class Desktop implements Computer {
    public void writingCode() {
        System.out.println("Bulding apps on Desktop");
    }

}

class Developer {
    public void buildApp(Computer computer) {
        computer.writingCode();
    }
}

public class p_025_01 {
    public static void main(String[] args) {
        Computer desktop1 = new Desktop();
        Laptop laptop1 = new Laptop();
        Developer dev1 = new Developer();
        Developer dev2 = new Developer();
        dev1.buildApp(desktop1);
        dev2.buildApp(laptop1);
    }
}
