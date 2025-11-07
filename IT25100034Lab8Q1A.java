import java.util.Scanner;
public class IT25100034Lab8Q1A{
	public static void main(String []args){
		
		Scanner q1=new Scanner(System.in);
		
		String reverse="";
		int count;
		
		int myArray[]=new int[5];
		
		System.out.println("Enter 5 Numbers: ");
		
		for(count=0;count<5;count++){
			System.out.print("Enter Number "+(count+1)+": ");
			myArray[count]=q1.nextInt();
			
			
			//reverse=" "+ myArray[count]+reverse; we can use like this also but output is bit different
		}
		System.out.println();
		System.out.println("Array in Reverse Order:");
		
		//System.out.println(reverse);
		
		for(count=4;count>=0;count--){
			
			System.out.print(myArray[count]+ " ");//to get the exact output according to the labsheet
		}
		
	}
}