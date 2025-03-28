package question09;

class PointThree{
	private int x,y;
	public PointThree(int x, int y) {
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
public class Point3D extends PointThree{
	int z;
	public Point3D(int x, int y ,int z) {
		super(x, y);
		this.z=z;
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return "("+getX()+","+getY()+","+this.z+")의 점";
	}
	public void moveUp() {
		z+=1;
	}
	public void moveDown() {
		z-=1;
	}
	
//오버라이드가 아니면 또 알빠 아니구나 매개변수 개수가 달라서
	protected void move(int x, int y,int z) {
		super.move(x, y);
		this.z=z;
	}
	public static void main(String[] args) {
		Point3D p=new Point3D(1,2,3);
		System.out.println(p.toString()+"입니다.");
		
		p.moveUp();
		System.out.println(p.toString()+"입니다.");
		
		p.moveDown();
		p.move(10, 10);
		System.out.println(p.toString()+"입니다.");
		
		p.move(100, 200 ,300);
		System.out.println(p.toString()+"입니다.");
	}
}
