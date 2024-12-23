public class MyClass {
    // Fields
    private int age; // not initialised
    private String name;

    // Constructor
    public MyClass(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // Methods
    public void display() {
        System.out.prrintln( "age :" + age + ", name:" + name );
    }

    // main method
    public static void main(String[] args) {
        // Creating an object
        MyClass obj1 = new MyClass(25, "Manish");

        // calling a method
        obj1.display();
    }
}