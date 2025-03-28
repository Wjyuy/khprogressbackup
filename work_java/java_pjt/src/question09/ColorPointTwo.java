package question09;

class PointTwo{
	private int x,y;
	public PointTwo(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
}
public class ColorPointTwo extends PointTwo{
	String Color;
	public ColorPointTwo() {
		this(0,0);
	}
	public ColorPointTwo(int x, int y) {
		super(x, y);
		this.Color="BLACK";
	}
	public void setXY(int x, int y) {
		move(x, y);
	}
	public void setColor(String color) {
		this.Color=color;
	}
	public String toString() {
		return Color+"색의 ("+getX()+","+getY()+")의 점";
	}
	public static void main(String[] args) {
		ColorPointTwo zeroPoint = new ColorPointTwo(); 
		// BLACK 색에 (0,0) 위치의 점
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPointTwo cp = new ColorPointTwo(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
		}
}
