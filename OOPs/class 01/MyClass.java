public class MyClass {
    // Fields
    private int a;
    private int b;
    private int age; // not initialised
    private String name;

    // Default Constructor
    public MyClass() {
        
    }

    // Parametrized Constructor
    public MyClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public MyClass(int b, String name) {
        this.b = b;
        this.name = name;
    }

    public MyClass(int a, int b, int age, String name) {
        this.a = a;
        this.b = b;
        this.age = age;
        this.name = name;
    }

    // main method
    public static void main(String[] args) {
        MyClass obj = new MyClass(5, 6, 7, "abcd");
    }
}