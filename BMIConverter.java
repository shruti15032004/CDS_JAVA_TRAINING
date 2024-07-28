import java.util.Scanner;

public class BMIConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ----To Calculate BMI (Body Mass Index)----------------");
        System.out.println(" Enter your weight");
        float weight= scanner.nextFloat();
        System.out.println(" Enter your height in meter");
        float height = scanner.nextFloat();
        float bmi= (float)bodymassindex(weight,height);
        System.out.println("your BMI is : "+ bmi);
        if (bmi<=18.5){
            System.out.println(" you are under weight");
        } else if (bmi>=18.5&& bmi<24.9) {
            System.out.println("Your weight is Normal");
        }
        else {
            System.out.println(" You are OverWeight");
        }
    }

    private static float bodymassindex(float weight, float height) {
        return  (weight/(height* height));
    }
}
