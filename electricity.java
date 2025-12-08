import java.util.Scanner;
public class electricity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int unit;
		System.out.println("enter your using electricity is:");
		unit=scn.nextInt();
		if (unit<30) { 
		double rup=unit*3.50;
			System.out.println(rup);
		}
			
			else if(unit>=30&&unit<50) {
				double y=unit*5.25;
				System.out.println(y);
				
			}
		
			else if (unit>=50&&unit<100) {
				double z=unit*5.25;
				System.out.println(z);
			}
			else {
				double a=unit*5.85;
				System.out.println(a);
			}
	}
}

	


