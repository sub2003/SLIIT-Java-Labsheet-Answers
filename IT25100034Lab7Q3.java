import java.util.Scanner;
public class IT25100034Lab7Q3{
	public static void main(String[]args){
		
		Scanner lab7=new Scanner(System.in);
		
		int customer=1;
		double billAmount=0;
		char paymentMode='0',upperCase;
		double discount=0;

		while(customer<6){
		
			System.out.println("Customer "+customer);
			
			System.out.print("Enter total bill amount: ");
			billAmount=lab7.nextDouble();
			
			System.out.print("Enter mode of payment (C for cash, O for other): ");
			paymentMode=lab7.next().charAt(0);

			upperCase=Character.toUpperCase(paymentMode);
			
				if(upperCase=='C'){
					discount=billAmount*0.05;
					System.out.println("Discount is : "+discount);
				}
				else if(upperCase=='O'){
					discount=0.0;
					System.out.println("No discount applicable");
				}

				if(upperCase!='O' && upperCase!='C'){
					System.out.println("Payment Mode is Not Valid"); 
				}
				else
				System.out.println("Amount to be paid: "+(billAmount-discount));
			customer++;
			System.out.println();
			
		}
	
	}
}