import java.util.Scanner;
public class IT25100034Lab3Q2{
    public static void main(String [] args){
        Scanner Lab3=new Scanner(System.in);

        System.out.print("Enter the monthly salary: ");
        double Salary=Lab3.nextDouble();

        System.out.print("Enter the number of OT hours: ");
        double OT=Lab3.nextDouble();

        System.out.print("Enter the OT hourly rate: ");
        double hourlyRate=Lab3.nextDouble();

        System.out.println();

        double total=Salary+OT*hourlyRate;

        System.out.printf("The total salary including OT is: %.1f",total);

    }
}