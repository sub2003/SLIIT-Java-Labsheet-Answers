import java.util.Scanner;
public class IT25100034Lab3Q4{
    public static void main (String[]args){

        Scanner Lab3=new Scanner(System.in);
        
        System.out.print("Enter a five-digit number: ");
        int digit=Lab3.nextInt();

        System.out.println();
        int remain,tenThousands,thousands,hundreds,tens,ones;

        if (digit<=99999 && digit>0){
            tenThousands=digit/10000;
            remain=digit%10000;

            thousands=remain/1000;
            remain=remain%1000;

            hundreds=remain/100;
            remain=remain%100;

            tens=remain/10;
            remain=remain%10;

            ones=remain/1;

            System.out.println(tenThousands+" "+thousands+" "+hundreds+" "+tens+" "+ones);

        }
        else{
            System.out.println("Invalid number!");
        }

    }
}