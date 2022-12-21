// 1. Write a Java programme using the following steps.
                //1.1 Declare two instance variables.
                //1.2 Declare one instance method.
                //1.3 Call both instance variables into the instance method inside the print statement.
                // 1.4 Declare the Main method.
                //1.5 Call the above instance method into the Main method and Run the programme.
public class Variables { //Declared Class
    int c = 68;  int d = 54;  // Declared Instance Variables

                void m1 () { // Declared Instance Method
                    System.out.println(c);  //   Called instance
                    System.out.println(d);   //  Called instance
                }

                public static void main(String[] args) {  //Main method
                  Variables v = new Variables();      // create object
                  v.m1();
                    }
}


