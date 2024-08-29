import java.util.Scanner;

public class Constructor_demo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter number a ");
        int a=scanner.nextInt();
        System.out.println("Enter number b");
        int b = scanner.nextInt();
        System.out.println("Enter choice  \n 1.addition\n 2.subtraction\n3.multiplication\n 4.division ");
        int choice = scanner.nextInt();
        Demo d=new Demo(a,b,choice);
    }
}
class Demo {

    int a;
    int b;
    int choice;

    public Demo(int a ,int b ,int choice) {

        this.a = a;
        this.b=b;
        this.choice=choice;
         switch(choice){
             case 1:
                 System.out.println(a+b);
                 break;
             case 2:
                 System.out.println(a-b);
                 break;
             case 3:
                 System.out.println(a*b);
                 break;
             case 4:
                 System.out.println(a/b);
                 break;
         }
    }
}