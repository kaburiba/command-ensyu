import java.util.Scanner;

public class Bmi{
    public static void main(String[] args) {
     
            Scanner sc = new Scanner(System.in);
            System.out.print("�g��(m)�F");
            Double height = sc.nextDouble();
            System.out.print("�̏d(kg)�F");
            Double weight = sc.nextDouble();

            Double BMI = weight / (height*height);
            System.out.println("BMI�F" + String.format("%.2f",BMI));

		
   		 Scanner sc1 = new Scanner(System.in);
            System.out.print("�g��(m)�F");
            Double height1 = sc1.nextDouble();
            System.out.print("�̏d(kg)�F");
            Double weight1 = sc1.nextDouble();

            Double BMI1 = weight1 / (height1*height1);
            System.out.println("BMI�F" + String.format("%.2f",BMI1));
    }
}

