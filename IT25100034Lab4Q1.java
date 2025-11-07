import java.util.Scanner;

public class IT25100034Lab4Q1{
    public static void main(String []args){
        Scanner Lab4=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number=Lab4.nextInt();

        String value;

        if(number<0){
            value = "Negative";
        }
        else if(number>0){
            value="Positive";
        }
        else{
            value="Zero";
        }
        System.out.println("The number is: "+value);
    }
}