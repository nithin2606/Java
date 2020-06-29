package fir;
import java.util.Scanner;
public class call{
	private static int callid;
	private static long callednumber;
	private static float duration;
	
	public static int getCallid() {
		return callid;
	}
	public static void setCallid(int callid) {
		call.callid = callid;
	}
	public static long getCallednumber() {
		return callednumber;
	}
	public static void setCallednumber(long callednumber) {
		call.callednumber = callednumber;
	}
	public static float getDuration() {
		return duration;
	}
	public static void setDuration(float duration) {
		call.duration = duration;
	}
	public static void parseData(String details) {
		String[] newdetails = details.split(":");
		setCallid(Integer.parseInt(newdetails[0]));
		setCallednumber(Long.valueOf(newdetails[1]));
		setDuration(Float.valueOf(newdetails[2])); 
		}
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the call details:");
		String details = scan.nextLine();
		call.parseData(details);
		System.out.println("Call id:"+call.getCallid());
		System.out.println("Called Number:"+call.getCallednumber());
		System.out.println("Duration:"+call.getDuration());
	}
	
}