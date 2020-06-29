package fir;

public class Product {
	

	     int productId;

	     String productName;

	     static int count  = 0;

	 

	     public Product(int pid,String name){

	          productId = pid;

	          productName=name;

	          count++;

	     }

	    

	     public static void main(String arg[]){

	         

	          Product p1=new Product(101,"Screws");

	           System.out.println("count "+Product.count);

	          Product p2=new Product(102,"Nuts");

	          Product p3=new Product(103,"Nails");

	           System.out.println(""+p3.count);

	     }

}
