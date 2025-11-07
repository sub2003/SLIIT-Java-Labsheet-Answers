import java.util.Scanner;
public class IT25100034Lab3Q1B{
    public static void main(String [] args){

        Scanner Lab3=new Scanner(System.in);
        
        System.out.print("Enter the price of 1kg of rice: ");
        double price=Lab3.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        double kgs=Lab3.nextDouble();

        double totalAmount=price*kgs;
        totalAmount=totalAmount-totalAmount*0.1;

        System.out.println();
        System.out.println("The total amount with 10% discount is: "+totalAmount);



    }
}