import java.util.Scanner;
public class IT25100034Lab4Q2{
    public static void main(String [] args){

        Scanner Lab4=new Scanner(System.in);

        double examMarks=0,labMarks=0,examPercentage=0,labPercentage=0;

        System.out.print("Please enter exam marks (out of 100):  ");
        examMarks=Lab4.nextDouble();

        if (examMarks<=100 && examMarks>0){

            System.out.print("Please enter lab submission marks (out of 100): ");
            labMarks=Lab4.nextDouble();

            if (labMarks<=100 && labMarks>0){

                System.out.print("Please enter the percentage given for the exam: ");
                examPercentage=Lab4.nextDouble();

                System.out.print("Please enter the percentage given for the lab submission: ");
                labPercentage=Lab4.nextDouble();

                if (examPercentage+labPercentage==100){

                    double finalMarks=(examMarks*examPercentage/100.0)+(labMarks*labPercentage/100.0);
                    System.out.println();
                    System.out.printf("Final Exam Mark is : %.1f",finalMarks);
                }
                else{
                    System.out.println("The percentages must add up to 100. Terminating program.");
                }
            }
            else    {
                System.out.println("Invalid input for lab submission marks. Terminating program.");
            }
        }
        else {
            System.out.println("Invalid input for exam marks. Terminating program.");
        }

    }
}