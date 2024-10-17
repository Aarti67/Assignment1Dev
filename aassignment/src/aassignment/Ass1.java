package aassignment;

import java.util.Scanner;

public class Ass1 {


public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number num1");
	int num1 = sc.nextInt(); 
	System.out.println("Enter a number num2");
	int num2 = sc.nextInt(); 
	System.out.println("Enter a number num3");

	int num3 = sc.nextInt(); 
	
	int largest = Math.max(num1, Math.max(num2, num3));
    int smallest = Math.min(num1, Math.min(num2, num3));


    int sum = largest + smallest;
    System.out.println("The sum of the largest and smallest numbers is: " + sum);

    sc.close();
}




}
