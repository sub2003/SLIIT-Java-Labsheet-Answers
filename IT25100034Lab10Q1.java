import java.util.Scanner;
public class IT25100034Lab10Q1{
	public static void main(String [] args){
		
		Scanner q1=new Scanner(System.in);
		
		char grade;
		int mark;
		
		System.out.print("Enter the mark (0 - 100) : ");
		mark=q1.nextInt();
		
		markRange(mark); // Validate mark

		grade=Grade(mark); // get grade
		
		validGrade(grade); //Check if grade is one of the valid letters (A–F)
		
		testdetemineGrade(grade); // Assertion to ensure grade is valid

		System.out.println("The Grade for the Entered Mark is: "+grade);
	}
	public static void markRange(int mark){
		assert(mark >=0 && mark<=100):"Invalid Mark";
		System.out.println();
		System.out.println("Mark is Validated");
	}
	public static char Grade(int mark){
		char grade;
        if (mark>=75 && mark<=100) {
            grade = 'A';
        } 
		else if (mark >= 60) {
            grade = 'B';
        } 
		else if (mark >= 50) {
            grade = 'C';
        } 
		else if (mark >= 40) {
            grade = 'D';
        } 
		else if(mark>=0 && mark<=39){
            grade = 'F';
        }
		else
			grade='W';
		
		return grade;
	}
	public static boolean validGrade(char grade){
		
		if(grade=='A' || grade =='B' || grade=='C' || grade=='D' || grade=='F')
		return true;
		
		else 
		return false;
	}
	public static void testdetemineGrade(char grade){
		assert validGrade(grade):"Incorrect Grade Assigned";
	}
	

}