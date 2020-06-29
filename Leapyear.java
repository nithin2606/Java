package fir;
import java.util.*;
public class Leapyear{
	    public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the year");
	       int year=sc.nextInt();
	        if(year<0)
	        {
	            System.out.print("Invalid Year");
	            
	            
	        }
	        else
	        {
	        int t=year;
	        int sum;
	        int count=0;
	        while(t!=0)
	        {
	            t/=10;
	            ++count;
	        }
	        if(count<4)
	        {
	            System.out.print("Invalid Year");
	        }
	        
	        else
	        {
	            if(((year%4==0) &&(year%100!=0)) ||(year%400==0))
	            System.out.println("Leap Year");
	            else
	            {
	                System.out.print("Not a Leap Year");
	            }
	        }
	        }
	    }
	}

