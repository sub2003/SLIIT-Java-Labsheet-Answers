import java.util.Scanner;
public class IT25100034Lab8Q3{
	public static void main(String[]args){
		
		Scanner q3=new Scanner(System.in);
		
		int i=0,max=0;
		int positiveNumber[]=new int[6];
		String content="";
		
		for(i=0;i<6;i++){
		System.out.print("Enter a Positive Number ("+(i+1)+"/6): ");
		positiveNumber[i]=q3.nextInt();
		
			if(positiveNumber[i]<=0){
				System.out.println("Error: Please Enter ON Positive Numbers");
				i--;
				continue;
			}
		
		content+=positiveNumber[i]+" ";
			
			
			
		}
		System.out.println();
		
		System.out.println("Array Contents:");
		System.out.println(content);
		
		for(i=0;i<5;i++){ // as elemenets are definitly positive integers
			if(positiveNumber[i]>max)
				max=positiveNumber[i];
		}
		
		System.out.println("The Maximum Number Entered: "+max);
		
		
		
		
	}	
}