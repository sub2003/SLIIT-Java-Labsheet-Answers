import java.util.Scanner;
public class IT25100034Lab9Q4{
    public static void main(String[]args){
        Scanner q4=new Scanner(System.in);

        String studentName[]=new String[5];
        int x=0;
        double aMark[]=new double [5];
        double exMark[]=new double [5];
        double finalMark[]=new double [5];
        char grade[]=new char[5];

        while(x<5){
			System.out.print("Enter Name  of Student number "+(x+1)+": ");
			studentName[x]=q4.nextLine();
			
			while(true){
				System.out.print("Enter Assignment Mark (out of 100) for "+studentName[x]+": "); 
				aMark[x]=q4.nextDouble();
				q4.nextLine();
				
				if(aMark[x]<=100 && aMark[x]>=0){

					while (true) {
						System.out.print("Enter Exam Paper Mark (out of 100) for "+studentName[x]+": ");
						exMark[x]=q4.nextDouble();
						q4.nextLine();

						if(exMark[x]<=100 && exMark[x]>=0)
							break;

						else{
							System.out.println("Invalid Marks! Please try again.");
							continue;
						}
					}
				}
				else{
					System.out.println("Invalid Marks! Please try again.");
					continue;
				}
				
				break;
            
            
			}
        System.out.println();
        
        finalMark[x]=calcFinalMark(aMark[x], exMark[x]);
        grade[x]=findGrades(finalMark[x]);
        x++;
            
        }
        System.out.println("Name            Final Mark        Grade");
        x=0;
        while(x<5){
            printDetails(studentName[x], finalMark[x],grade[x]);
        x++;
        }
        
    }
    public static double calcFinalMark(double aMark,double exMark){
        double result;
        
            return result=aMark*0.3+exMark*0.7;
        
        
    }
    public static char findGrades(double finalMark){
        char result;

        if(finalMark>=75)
        result = 'A';
        else if(finalMark>=60)
        result = 'B';
        else if(finalMark>=50)
        result = 'C';
        else 
        result = 'F';
        

        return result;
    }
    public static void printDetails(String studentName, double finalMark, char grade){
        
            System.out.printf("%s           %.2f            %c\n",studentName,finalMark,grade);
        
    }
}