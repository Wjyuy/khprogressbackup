package question09;

public class IPTV extends ColorTV{
	String IP;
	public IPTV(String iP, int size, int color) {
		super(size,color);
		this.IP = iP;
	}
	@Override
	public void printProperty() {
		System.out.print("나의 IPTV는 "+IP+"주소의 ");
		super.printProperty();
	}

	public static void main(String[] args) {
		IPTV iptv= new IPTV("192.1.1.2",32,2048);
		iptv.printProperty();
	}
}
