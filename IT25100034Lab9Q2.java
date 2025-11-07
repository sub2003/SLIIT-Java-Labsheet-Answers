import java.util.Scanner;
public class IT25100034Lab9Q2{
	public static void main (String[]args){
		Scanner q2=new Scanner(System.in);
		
		
		System.out.print("Eneter the radius of the circle: ");
		double radius=3;
		
		double area=(22/7.0)*Math.pow(radius,2);
		
		System.out.printf("The area of the circle with radius %.1f is : %.14f",radius,area);
		
		
	}
	public static double circleArea(double radius){
		return Math.PI*Math.pow(radius,2);
	}
}