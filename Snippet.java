package fir;
import java.util.*;
public class Snippet {
	public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        System.out.println("Enter cells: ");
		        String s=sc.nextLine();
		        System.out.println("---------");
		        System.out.println("| "+s.charAt(0)+" "+s.charAt(1)+" "+s.charAt(2)+" |");
		        System.out.println("| "+s.charAt(3)+" "+s.charAt(4)+" "+s.charAt(5)+" |"); 
		        System.out.println("| "+s.charAt(6)+" "+s.charAt(7)+" "+s.charAt(8)+" |");
		        System.out.println("---------");
		        
		        int n=0,xs=0,os=0,dash=0;
		        char[][] a=new char[3][3];
		        for(int i=0;i<3;i++){
		            for(int j=0;j<3;j++){
		                a[i][j]=s.charAt(n);
		                n++;
		                if(a[i][j]=='X')
		                    xs++;
		                else if(a[i][j]=='O')
		                    os++;
		                else
		                    dash++;
		            }
		        }
		        System.out.println("Enter the coordinates: ");
		        int row=0;
		        int col=0;
		        boolean flag=true;
		        while(flag){
		        
		            try{
		                row=sc.nextInt();
		                col=sc.nextInt();
		            }
		            catch(InputMismatchException e){
		                System.out.println("You should enter numbers!");
		                continue;
		            }
		        
		            if(row>3||col>3||row<=0||col<=0){
		                System.out.println("Coordinates should be from 1 to 3!");
		                continue;
		            }
		            else if(a[3-col][row-1]!='_'||a[3-col][row-1]!=' '){
		                System.out.println("This cell is occupied! Choose another one!");
		                continue;
		            }
		            flag=false;
		            
		        }
		        if(a[3-col][row-1]=='_'||a[3-col][row-1]==' '){
		            a[3-col][row-1]='X';
		        }
		        
	}
}

