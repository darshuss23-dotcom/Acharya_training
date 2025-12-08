package Programinstatement;
import java.util.*;
public class AbsoluteNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the number:");
		int num = sc.nextInt();
		if(num < 0) {
			num = - num;
		}
		System.out.println("the absolute number:"+num);
	}

}
