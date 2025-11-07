import java.util.Scanner;
public class IT25100034Lab8Q2{
	public static void main(String[]args){
		
		Scanner q2= new Scanner(System.in);
		
		int i=0;
		int []A=new int[5];
		int []B=new int[5];
		int	[]C=new int[5];
		String c="";
		
		System.out.println("A Array Contents:");
		for(i=0;i<5;i++){
			A[i]=q2.nextInt();
		}
		
		System.out.println();
		
		System.out.println("B Array Contents:");
		for(i=0;i<5;i++){
			B[i]=q2.nextInt();
		}
		
		System.out.println();
		
		for(i=0;i<5;i++){
				C[i]=A[i]+B[i];
				c=c+C[i]+" ";
				
		}
		System.out.println("C Array Contents (A+B):");
		System.out.println(c);
	}
}