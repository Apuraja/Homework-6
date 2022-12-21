//      2. Write a Java programme using the following steps.
//2.1 Declare two static variables
//2.2 Declare one static method
//2.3 Call both static variables into the static method inside the print statement
//. 2.4 Declare the Main method.
//2.5 Call the static method into the Main method and Run the programme.
public class Static {
    static int c = 50;  //Declared static variable
    static String name = "Patel"; //Declared static variable
    static Variables g = new Variables();  //Create an Object{

    static void m1()    // Declared Static method
    {
        System.out.println(c);          //Called static variable to static method Directly
        System.out.println(name);    //Called static variable to static method via Class name
    }

    public static void main(String[] args) {   //Declared Main Method
        m1();

    }
}