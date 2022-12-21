//                    3. Write a Java programme using the following steps.
//3.1 Declare one instance and one static variable.
//3.2 Declare one instance method.
//3.3 Declare one static method.
//3.4 Call both instance and static variables into both instance and static methods inside the print statement
//3.5 Declare the Main method.
//3.6 Call both instance and static methods into the Main method and run the programme.
    public class Three {
    int d = 54;  // Declared Instance Variables
    static String name = "Arpita";  //Declared static variable

    public void m1()  // Declared Instance Method
    {
        System.out.println(d);
    }

    static void m2()  // Declared Static method
    {
        System.out.println(name);
    }

    public static void main(String[] args) {  //Declared Main Method
        Variables h = new Variables();          // Create object
        h.m1();
        m2();
    }
}



