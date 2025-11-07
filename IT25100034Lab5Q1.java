import java.util.Scanner;
public class IT25100034Lab5Q1{
    public static void main(String[] args){

        int first,second,third;
        
        Scanner Lab5= new Scanner(System.in);
        
        System.out.print("Enter the first integer: ");
        first=Lab5.nextInt();
        

        System.out.print("Enter the second integer: ");
        second=Lab5.nextInt();


        System.out.print("Enter the third integer: ");
        third=Lab5.nextInt();

        System.out.println();
        
        System.out.println("User entered numbers are : "+first+" "+second+" "+third);



        if (first<second && first<third){
            System.out.println("The Smallest number is: "+first);
        }
        else if(second<first &&second<third){
            System.out.println("The Smallest number is: "+second);
        }
        else{
            System.out.println("The Smallest number is: "+third);
        }


        if(first>second && first>third){
            System.out.println("The Largest number is: "+first);
        }
        else if(second>first && second>third){
            System.out.println("The Largest number is: "+second);
        }
        else{
            System.out.println("The Largest number is: "+third);
        }
    
    
    
    }
}