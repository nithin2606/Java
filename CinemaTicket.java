package fir;
import java.util.Scanner;
import java.text.DecimalFormat;
class CinemaTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("####0.00");
        
        int ticketsNo;
        System.out.print("Enter the no of ticket:");
        ticketsNo = sc.nextInt();
        
        if(ticketsNo>=5 && ticketsNo <=40) {
            System.out.print("Do you want refreshment:");
            char refresh = sc.next().charAt(0);
            System.out.print("Do you want coupon code:");
            char coupon = sc.next().charAt(0);
            System.out.print("Enter the circle:");
            char circle = sc.next().charAt(0);
            
            double ticketCost=0.0;
            if(circle =='k') {
                ticketCost += ticketsNo *75;
            }else if(circle =='q'){
                ticketCost += ticketsNo *150;
            }
            
            double ticketMax = 0.0;
            if(ticketsNo > 20){
                ticketMax = 0.1*ticketCost;
            }
            double ticketCoupon = 0.0;
            if(coupon == 'y'){
                ticketCoupon = 0.02*ticketCost;
            }
            
            double ticketRefresh = 0.0;
            if(refresh == 'y'){
                ticketRefresh = 50*ticketsNo;
            }
            
            ticketCost = ticketCost-ticketMax-ticketCoupon+ticketRefresh;
            System.out.println("Ticket cost:"+df.format(ticketCost));
        }
        else {
            System.out.println("Minimum of 5 and Maximun of 40 Tickets");
        }
        
    }
}