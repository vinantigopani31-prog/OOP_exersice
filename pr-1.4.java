import java.util.*;
public class BMIcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in pounds : ");
        double weightpounds = sc.nextDouble();
        System.out.println("Enter height in inches : ");
        double heightinches = sc.nextDouble();
        double weightkg = weightpounds * 0.45359237 ;
        double heightmeters = heightinches * 0.0254 ;
        double bmi = weightkg / (heightmeters * heightmeters) ;
        System.out.printf("Your BMI is : %.2f", bmi);
        sc.close();
    }
}

/*output:
Enter weight in pounds : 
150
Enter height in inches : 
65
Your BMI is : 24.96
Enter weight in pounds : 
180
Enter height in inches : 
70
Your BMI is : 25.82 */