public class MyClass {
    private int myInt;
    private String myString;

    // copy constructor
    public MyClass( MyClass obj ) {
        this.myInt = obj.myInt;
        this.myString = obj.myString;
    }

    // paramaterized contructor
    public MyClass(int myInt, String myString) {
        this.myInt = myInt;
        this.myString = myString;
    }

    public void displayValues() {
        System.out.println("myInt : " + myInt);
        System.out.println("myString : " + myString);
    }

    public static void main(String[] args) {
        MyClass originalObj = new MyClass(10, "Hello");

        MyClass copiedObj = new MyClass(originalObj);

        originalObj.displayValues();
        copiedObj.displayValues();
    }
}