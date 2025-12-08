import java.util.*;

public class digitts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int fact=1;
		for(int i=num; i>=1; i--) {
			fact=fact*i;
			
		}
       System.out.println("factorial of"+num+"="+fact);
	}

}
