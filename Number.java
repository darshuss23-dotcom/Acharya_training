
public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=6784;
		int sum=0;
		while (number>0) {
			int digit=number %10;
			sum=sum+digit;
			number=number/10;
			
			System.out.println("sum of digits="+sum);
					
		}
			

	}

}

