import java.util.Scanner;
public class IT25100034Lab6Q1{
    public static void main(String[]args){
        double number,square,squareRoot;
        Scanner Lab6=new Scanner(System.in);

        System.out.print("Enter a number: ");
        number=Lab6.nextDouble();

        System.out.println();

        square=Math.pow(number,2);
        squareRoot=Math.sqrt(number);

        System.out.printf("The square of %.1f is : %.1f\n",number,square);
        System.out.printf("The square root of %.1f is : %.1f",number,squareRoot);
    }
}