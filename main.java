import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     
            Scanner sc = new Scanner(System.in);
            System.out.print("�g��(m)�F");
            Double height = sc.nextDouble();
            System.out.print("�̏d(kg)�F");
            Double weight = sc.nextDouble();

            Double BMI = weight / (height*height);
            System.out.println("BMI�F" + String.format("%.2f",BMI));
    }
}

