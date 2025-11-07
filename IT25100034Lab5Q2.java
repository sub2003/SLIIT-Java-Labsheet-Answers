import java.util.Scanner;
public class IT25100034Lab5Q2{
    public static void main(String[]args){

        Scanner Lab5=new Scanner(System.in);

        System.out.print("Enter the number of new members introduced: ");
        int count=Lab5.nextInt();

        

        String prize="0";

        switch(count){
            case 0:
                prize= "No Prize";
                break;
            case 1:
                prize="Pen";
                break;
            case 2:
                prize= "Umbrella";
                break;
            case 3:
                prize="Bag";
                break;
            case 4:
                prize="Travelling Chair";
                break;    
            default:
                if (count>=5){
                    prize="Headphone";
                }
                
                else{
                    System.out.println("Input must be a number 0 or greater");
                }
        }

        System.out.println();
        if (count==0){
            System.out.println(prize);
        }
        else if(count>=1){
            System.out.println("Prize is a : "+prize);
        }
      
    }
}