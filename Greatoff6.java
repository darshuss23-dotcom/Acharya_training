package Programinstatement;
import java.util.Scanner;
public class Greatoff6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner SC = new Scanner(System.in);
		System.out.println("enter a:");
		int a = SC.nextInt();
		System.out.println("enter b:");
		int b = SC.nextInt();
		boolean result = (a==6|| b ==6||(a+b)==6 ||Math.abs(a-b)==6);
		System.out.println(result);

	}

	
}
