
import java.util.*;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size of an array : ");
		Scanner sc= new Scanner(System.in);
			int a = sc.nextInt();
			int[]array=new int[a];
			for(int i=0;i<array.length;i++) {
				System.out.println("Enter the index value of "+i+"=");
			array[i]=sc.nextInt();
			}
	for(int i=0; i<array.length;i++) {
		System.out.println(array[i]+"");
		}

	}
}


