import java.util.Scanner;

public class IT25100034Lab3Q3 {
    public static void main(String[] args) {
        Scanner lab3 = new Scanner(System.in);

        System.out.print("Enter the Rupee amount: ");
        int amount = lab3.nextInt();  

        System.out.println();

        int n5000,n1000,n500,n200,n100,n50,n20,c10,c5,c2,c1;

        n5000 = amount / 5000;
        amount = amount % 5000;

        n1000 = amount / 1000;
        amount = amount % 1000;

        n500 = amount / 500;
        amount = amount % 500;

        n200 = amount / 200;
        amount = amount % 200;

        n100 = amount / 100;
        amount = amount % 100;

        n50 = amount / 50;
        amount = amount % 50;

        n20 = amount / 20;
        amount = amount % 20;

        c10 = amount / 10;
        amount = amount % 10;

        c5 = amount / 5;
        amount = amount % 5;

        c2 = amount / 2;
        amount = amount % 2;

        c1 = amount;

        System.out.println("5000 Notes - " + n5000);
        System.out.println("1000 Notes - " + n1000);
        System.out.println("500 Notes - " + n500);
        System.out.println("200 Notes - " + n200);
        System.out.println("100 Notes - " + n100);
        System.out.println("50 Notes - " + n50);
        System.out.println("20 Notes - " + n20);
        System.out.println("10 Coins - " + c10);
        System.out.println("05 Coins - " + c5);
        System.out.println("02 Coins - " + c2);
        System.out.println("01 Coins - " + c1);

    }
}