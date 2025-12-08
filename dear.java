/*write a program to input total amount in a bill, if amount is greater than 1000 then add a discount of 8% t
o the bill amount is greater than add a disscount of 15% of the bill amount if the 
amount is less than 1000 then no discount.*/
import java.util.Scanner;
public class dear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("your bill amount is:");
		int amount=sc.nextInt();
		int dics;
		int pay;
		if(amount>1000&&amount<2000) {
		dics=amount/100*8;
		pay=amount-dics;
		System.out.println("you shop above 1000 ruppes so will get 8% discount so you payble amount is:"+pay);
		}
		else if (amount>2000) {
			dics=amount/100*15;
			pay=amount-dics;
			System.out.println("you shop above 2000 ruppes so will get 15% discount so you payble amount is:"+pay); 
		}
			else {
				System.out.println("payable amount"+amount);
			}
		}
		
		}

	


