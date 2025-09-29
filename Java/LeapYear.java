import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the year: ");
		int lpy = sc.nextInt();
		if((lpy%400==0) || ((lpy%100!=0)&&(lpy%4==0)))
			System.out.println(" "+lpy+" is Leap Year!!!");
		else
			System.out.println(" "+lpy+" is NOT Leap Year");
	}
}
