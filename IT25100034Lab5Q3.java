import java.util.Scanner;
public class IT25100034Lab5Q3{
    
    public static final double roomCharge=48000.0;
    public static final int minDate=1;
    public static final int maxDate=31;
    
    public static void main(String [] args){

        Scanner Lab5=new Scanner(System.in);

        int startDate,endDate,reservedDays=0;
        double discountRate=0,totalPaymenet;

        System.out.print("Enter Start Date (1-31): ");
        startDate=Lab5.nextInt();

        System.out.print("Enter End Date (1-31): ");
        endDate=Lab5.nextInt();

        if (startDate>=endDate)
                System.out.println("Error: Start Date must be less than End Date");

        else{
            if ((endDate>maxDate || endDate<minDate) || (startDate>maxDate || startDate<minDate)){
                System.out.println("Error: Days must be between 1 and 31");
            }
            else{

                reservedDays=endDate-startDate;

                if(reservedDays<3){
                    discountRate = 0.0;
                }
                else if(reservedDays>=3 && reservedDays<=4){
                    discountRate=10.0;
                }
                else if(reservedDays>=5){
                    discountRate=20.0;
                }

            }
        }

       
        totalPaymenet=(roomCharge*reservedDays)-(roomCharge*(discountRate/100)*reservedDays);

        if(reservedDays>0){
            System.out.println();
            System.out.printf("Room Charge Per Day: Rs. %.1f/=\n",roomCharge);
            System.out.println("Number of Days Reserved: "+reservedDays);
            System.out.printf("Total Amount to be Paid: %.1f",totalPaymenet);
        }

    }
} 