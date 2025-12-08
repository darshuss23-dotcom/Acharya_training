import java.util.*;
public class Classtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the time");
		 time = sc.nextInt();
	}
		public static String pritTime(int time) {
			if(time<=12) 
				return"am";
			
			else if(time>=24) 
				return"pm";
			
			else
					return "no";
			
			}
		}
	
