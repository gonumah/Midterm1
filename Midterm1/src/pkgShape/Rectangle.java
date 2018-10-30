package pkgShape;

public class Rectangle extends Shape implements Comparable<Object>{
		
	private int iWidth;
	private int iLength;
	
	public Rectangle(int iWidth, int iLength) {
		super();
		this.iWidth = iWidth;
		this.iLength = iLength;
	}
	
	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}

	public int getiLength() {
		return iLength;
	}

	public void setiLength(int iLength) {
		this.iLength = iLength;
	}

	@Override
	public double area() {
		double a = iWidth * iLength;
		return a;
	}

	@Override
	public double perimeter() {
		double a = 2 * (iWidth + iLength);
		return a;
	}

	@Override
	public int compareTo(Object a) {
		int b = (int) (this.area() - ((Rectangle) a).area());
		return b;
	}
	
}