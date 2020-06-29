package fir;
import java.util.Scanner;
public class PrimeNumbers {
	public static boolean prime(int num) {
		boolean flag = true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag = false;
				break;
			}
			
		}
		return flag;
	}
	public static void main(String[] args) {
		String separator = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("First num:");
		int low = scan.nextInt();
		System.out.println("Second num:");
		int high = scan.nextInt();
		if(low>high||high<=0||low<0||(high-low) == 1) {System.out.println("Invalid input"); System.exit(0);}
		while(low<high) {
			if(prime(low)==true) {
				if(low>1) {
					System.out.printf(separator+"%d",low);
					separator = ",";
				}
			}
			low++;
		}

	}
}
