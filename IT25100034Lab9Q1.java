import java.util.Scanner;
public class IT25100034Lab9Q1{
    public static void main(String[]args){

        Scanner q1=new Scanner(System.in);

        System.out.print("Enter value a: ");
        double a=q1.nextDouble();
        System.out.print("Enter value b: ");
        double b=q1.nextDouble();
        System.out.print("Enter value c: ");
        double c=q1.nextDouble();

        System.out.println();

        double root2=(-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2.0*a);
        double root1=(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2.0*a);

        System.out.println("Roots are real and different :");
        System.out.printf("Root 1: %.2f\n",root1);
        System.out.printf("Root 2: %.2f",root2);
    }
}