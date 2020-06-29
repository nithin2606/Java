package fir;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int c[]=new int[26];
		int c1=0;
		for(int ch:s.toCharArray()) {
			c[ch-'A']++;
		}
		for(int i=0;i<26;i++) {
			if(c[i]%2!=0) {
				c1++;
			}
		}
		if(c1>1) {
			System.out.println("NO SOLUTION");
			System.exit(0);
		}
		ArrayList<String> list=new ArrayList<>(Arrays.asList(s.split("")));
		System.out.println(list);
	
	}
}
