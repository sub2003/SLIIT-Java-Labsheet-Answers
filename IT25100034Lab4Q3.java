import java.util.Scanner;

public class IT25100034Lab4Q3{
    public static void main(String []args){
        Scanner Lab4=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number=Lab4.nextInt();

        String value;

        value=(number>0)?"Positive":(number<0)?"Negative":"Zero";
        System.out.println("The number is: "+value);
        

    }
    
}