import java.util.Scanner;
public class IT25100034Lab8Q1B{
    public static void main(String[]args){
        
        Scanner q1=new Scanner(System.in);
        
        int count,i=0;
        int [] myArray=new int[5];
        int [] evenArray=new int[5];
        String mySequence="",evenSequence="";
        
        System.out.println("Enter 5 Numbers:");
		
        for(count=0;count<5;count++){
        
			System.out.print("Enter Number "+(count+1)+": ");
            myArray[count]=q1.nextInt();
            
            if(myArray[count]%2==0){// if myArray element number is a even nnumber
                
                evenArray[i]=myArray[count];//assign value to evenArray elements sequentially 
				i++;
            }
            
        mySequence=mySequence+myArray[count]+" ";
        }
		while(i<5){// assign 0 for remaining indexes 
			evenArray[i]=0;
			i++;
		}
		for(i=0;i<5;i++){
			evenSequence=evenSequence+evenArray[i]+" "; 
		}
		
		
        System.out.println();
        
        System.out.println("myArray Contents:");
        System.out.println(mySequence);
        
        System.out.println();
        
        System.out.println("evenArray Contents:");
        System.out.println(evenSequence);
        
    }
}
