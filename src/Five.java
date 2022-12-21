//     5. Write a program for a calculator with addition, subtraction, multiplication
//        and division methods all with parameters and use string concatenation
//               methods.(Note: Two static and Two instance methods.)
public class Five{
    public static void main(String[] args) {         // Main Method
        Five t =new   Five();                       //Create an Object
        t.addition();                              //Called Instance method using object name
        subtraction(100,50);               // called static method directly
        t.division(12,6);                   //Called Instance method using object name
        t.multiplication();                      //Called Instance method using object name
    }
    public void addition(){                    // Instance Method
        int a =15, b=5;
        System.out.println("Addition is " +(a+b));
    }
    public static void subtraction(int x, int y){        //Static Method
        System.out.println("Subtarction is " +(x-y));
    } //Static  Method
    public static void multiplication(){          //  Static Method
        int m =20, n= 15;
        System.out.println("Multiplication is "  +(m*n));
    }
    public void division(int a, int b){                     //Instance Method
        System.out.println("Division is  "  +(a/b));

    }
}
