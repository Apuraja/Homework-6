//            Write a Java programme using the following steps.
//4.1 Declare two instance and two static variables.
//4.2 Declare one instance method.
//4.3 Declare one static method.
//4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
//4.5 Declare the Main method.
//4.6 Call both instance and static methods into the Main method and run the programme.


public class Four {
    int b = 20;   int d = 50;                 //Instance Variable
    static String name1 = "Amazon";       static String name2 = "Urvesh1";         // Declared static variable
    public void m1(){                               // Instance method

        System.out.println(b);                      // Called instance Variable
        System.out.println(name1);                 // Called static variable
        System.out.println(d);                    // Called instance Variable
        System.out.println(name2);                //  Called static variable
    }
    static void m2() {                     // Static Method
        Four n = new Four();                  //Create an Object{
        System.out.println(n.b);                      // Called instance Variable
        System.out.println(name1);                 // Called static variable
        System.out.println(n.d);                    // Called instance Variable
        System.out.println(name2);//               //Declared Static method

    }

    public static void main(String[] args) {      // Main Method

        Four j = new Four();
            j.m1();
            m2();
        }
    }

