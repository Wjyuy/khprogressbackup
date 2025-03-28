package question09;

interface Shape10{
	final double PI=3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("--- 다시 그립니다.  ");
		draw();
	}
}
class Circle12 implements Shape10{
	private int r;
	public Circle12(int r) {this.r = r;}
	@Override
	public void draw() {System.out.println("반지름이 "+r+"인 원입니다.");		}
	@Override
	public double getArea() {return r*r*PI;}
	
}
class Oval implements Shape10{
	private int x,y;
	public Oval(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public void draw() { System.out.println(x+"x"+y+"에 내접하는 타원입니다.");}
	@Override
	public double getArea() {return x*y*PI*0.5*0.5;}
}
class Rect implements Shape10{
	private int x,y;
	public Rect(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public void draw() {System.out.println(x+"x"+y+"크기의 사각형 입니다.");}
	@Override
	public double getArea() {return x*y;}
}
public class Shapes2 {
	public static void main(String[] args) {
		Shape10[] list = new Shape10[3];
		list[0]=new Circle12(10);
		list[1]=new Oval(20,30);
		list[2]=new Rect(10,40);
		for (int i = 0; i < list.length; i++) {	list[i].redraw();}
		for (int i = 0; i < list.length; i++) {	System.out.println("면적은"+list[i].getArea());}
	}
}
