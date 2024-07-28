import java.util.Scanner;

public class AreaOfRectangleDemo {
    public static void main(String[] args) {
        areaofRectangle();

    }

    private static void areaofRectangle() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Area Of RECTANGLE");
        System.out.println(" enter the length  of Rectangle");
        int length= scanner.nextInt();
        System.out.println(" enter the width of Rectangle");
        int breath= scanner.nextInt();
        int area= length*breath;
        System.out.println("Area of Rectangle :  " + area);

    }
}
