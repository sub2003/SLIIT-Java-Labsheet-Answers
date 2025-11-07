import java.util.Scanner;

public class IT25100034Lab6Q3 {

    public static void main(String[]args){
        Scanner Lab6=new Scanner(System.in);

        int number,count=0;
        double RMS=0,value=0;
        System.out.println("Enter positive integers (terminate input with -99):");

        while(true){

            System.out.print("Enter a number: ");
            number=Lab6.nextInt();
            if(number==-99){
                break;
            }
            else if(number<0){
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
            }
            else{
                value=value+Math.pow(number,2);
                count++;
            }
        }
        if(count>0){
            RMS=Math.sqrt(value/count); 
            System.out.println();
            System.out.println("The Root Mean Square (RMS) is: "+RMS);
        }    
        
    }
}