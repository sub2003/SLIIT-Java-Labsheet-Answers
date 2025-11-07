import java.util.Scanner;
public class IT25100034Lab8Q4{
	public static void main(String[]args){
		
		Scanner q4=new Scanner(System.in);
		
		int [] studentId=new int[8];
		int i =0;
		
		for(i=0;i<studentId.length;i++){

			System.out.print("Enter Student ID for Student "+(i+1)+": ");
			studentId [i] =q4.nextInt();
			
			if(studentId[i]<=0){
				System.out.println("Error: Please Enter ONLY Positve Numbers");
				i--;
				continue;	
			}
		}
		
		System.out.println();
		
		System.out.print("Eneter a Student ID to Search: ");
		int searchId=q4.nextInt();
		
		System.out.println();

		boolean found=false;
		
		for(i=0;i<studentId.length;i++){
			if(searchId==studentId[i]){
				System.out.println("Student is Available");
				found=true;
				break;
			}
			
		}
		
		if(!found)
			System.out.println("Student is Not Available");
	}
}