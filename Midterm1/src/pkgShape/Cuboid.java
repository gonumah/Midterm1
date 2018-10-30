package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle{
		
	private int iDepth;
	
	public Cuboid(int iWidth, int iLength, int iDepth) {
		super(iWidth, iLength);
		this.iDepth = iDepth;
	}

	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}
	
	public double volume() {
		double a =  getiWidth() * getiLength() * iDepth;
		return a;
	}

	@Override
	public double area() {
		double a = 2 * (getiWidth()*iDepth + getiWidth()*getiLength()  + getiLength()*iDepth);
		return a;
	}
	
	@Override
	public double perimeter() {
		throw new UnsupportedOperationException("Invalid!");
	}
}

class SortByArea implements Comparator<Cuboid> {
	@Override
	public int compare(Cuboid o1, Cuboid o2) {
		int a = (int) (o1.area() - o2.area());
		return a;
	}
}

class SortByVolume implements Comparator<Cuboid> {
	@Override
	public int compare(Cuboid o1, Cuboid o2) {
		int a = (int) (o1.volume() - o2.volume());
		return a;
	}	
}