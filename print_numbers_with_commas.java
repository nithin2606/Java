package fir;
import java.util.Scanner;

public class print_numbers_with_commas {
	public static void main(String[] args) {
	

		    String separator = "";

		    Scanner sc = new Scanner(System.in);
		    int start = sc.nextInt();
		    int end = sc.nextInt();

		    for (int i =start; i <= end; i++) {

		        if (i<10) {
		            System.out.printf(separator + "%d", i);

		            separator = ",";
		        }

		   }
	}
}