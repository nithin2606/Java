package fir;
import java.util.Scanner;
public class numerology {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = (int)(Math.log10(num)+1);
		int i, a, b,count1,sum=0,c=0,even=0,odd=0,j;
		count1 = count;
		int num1 = num;
		System.out.print("The numbers are: ");
		for(i=0;i<count;i++)
		{
			b=(int)(Math.pow(10, (count1-1)));
			count1=count1-1;
			a = num/b%10;
			System.out.print(a+" ");
			if(a%2==0) {even++;}
			else {odd++;}
		}
		while (num > 0 || sum > 9)  
        { 
            if (num == 0) { 
                num = sum; 
                sum = 0; 
            } 
            sum += num % 10; 
            num /= 10; 
        }
		for(j=0;j<count;j++) {
			c = c +num1%10;
			num1 = num1/10;
		}
		System.out.println("\nSum is:"+c);
		System.out.println("\nNumerology number is  :" +sum);
		System.out.println("The no. of even numbers:"+even);
		System.out.println("The no. of odd numbers:"+odd);
	}
}
