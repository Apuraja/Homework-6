//              6. Write a program to enter any radius value of the circle and find out the
//                                area.(Formula of Area A=PI*r*r).
public class Six {
    private static final double radius = 7.5;

    public static void main(String[] args) {           // Main method

        double perimeter = 2 * Math.PI * radius;  //
        double area = Math.PI * radius * radius;  //

        System.out.println("Perimeter is = " + perimeter);  //
        System.out.println("Area is = " + area);               //
    }

}
