import java.util.Scanner;

public class IT25100034Lab6Q2C {
    public static void main(String[] args) {

        Scanner Lab6 = new Scanner(System.in);

        int number = 1, sum= 0,value = 0;
        double average=0;
        String numbers="";

        System.out.println("Please enter 10 numbers:");

        while (number <= 10) {
            System.out.print("Enter number " + number + ": ");
            value = Lab6.nextInt();
            numbers=numbers+value+" "; // also it can use like this -> amount+=value+" ";
            sum=sum+value;

         
            number++;
        }

        average = sum / 10.0;

        System.out.println();
        System.out.println("The numbers you entered are:");
        System.out.println(numbers);

        System.out.println();
        System.out.println("Sum of the numbers: " + sum);
        System.out.printf("Average of the numbers: %.1f\n", average);

        
    }
}
