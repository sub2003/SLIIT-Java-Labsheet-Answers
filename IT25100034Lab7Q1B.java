import java.util.Scanner;
public class IT25100034Lab7Q1B{
	public static void main(String[]args){
	
		Scanner lab7=new Scanner(System.in);

		int a,student,sum=0;
		int [] marks=new int[4];
		double average=0;
		String credit="";
		
		for(student=1;student<4;student++){
			System.out.println("Student "+student);
			System.out.print("Enter Marks : ");
			
			for(a=0;a<4;a++){
			marks[a]=lab7.nextInt();
				if (marks [a]<=100 && marks[a]>=0){
					sum=sum+marks[a];
				}
				else{
					credit="Invalid";
					System.out.println(credit);
				} 
			}
			
	

			if(credit!="Invalid"){
				average=sum/4.0;
				credit=(average<=100 && average>=75)?"Distinction":
				(average<=74 && average>=50)?"Credit":"Fail";
			
			
				System.out.println("Average is : "+average);
				System.out.println("Overall Grade is : " + credit);
				System.out.println();
			}
		sum=0;
		average=0;
		}
	}
}	