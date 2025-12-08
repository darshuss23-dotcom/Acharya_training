import java.util.Scanner;
public class pizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner (System.in);
		String size;
		System.out.println("what size of pizza you will order like small,medium,large &very large pizza avilable swith one to you want enter:");
		 size=scn.next();
		 switch(size) {
		 case"small":
			 System.out.println("yor order small pizza=50 ruppes");
			 break;
		 case"medium":
			 System.out.println("your order medium piza=100 ruppes");
			 break;
		 case"large":
			 System.out.println("your order large pizza=150 ruppes");
			 break;
		 case"verylarge":
			 System.out.println("your order verylarge pizza=200 ruppes");
			 break;
			 default:
				 System.out.println("not available this type or may be not understand ttry again");
		 } 
	}
}