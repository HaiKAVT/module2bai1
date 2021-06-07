import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float weight,height;
        System.out.println("Enter your Weight : ");
        weight = scanner.nextFloat();
        System.out.println("Enter your Height : ");
        height = scanner.nextFloat();
        float bmi = weight/(height*height);
       if(bmi <18){
           System.out.print(bmi+ " Underweight");
       }
       else if(bmi < 25){
           System.out.println(bmi+ " Normal");
       } else if(bmi < 30){
           System.out.println(bmi+ " Overweight");
       }else {
           System.out.println( bmi+ " Obese");
       }
    }
}
