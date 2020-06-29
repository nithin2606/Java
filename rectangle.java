package fir;

public class rectangle {
	private float length;
	private float breadth;
	public rectangle(float length,float breadth)
	{
		this.length  = length;
		this.breadth = breadth;
	}
	public float calcarea() {
		return length*breadth;
	}
	public float diff(rectangle r) {
		float area_diff = Math.abs(this.calcarea() - r.calcarea());
		return area_diff;
	}
	public static void main(String[] args) {
		rectangle r1 = new rectangle(10,20);
		rectangle r2 = new rectangle(20,30);
		float diff = r1.diff(r2);
		System.out.println("diff:"+diff);
	}
}
