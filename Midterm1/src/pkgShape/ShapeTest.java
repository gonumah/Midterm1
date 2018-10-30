package pkgShape;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Assertions;

public class ShapeTest {
	@Test
	public void RectangleTest() {
		Rectangle r = new Rectangle(2, 5);
		
		assertTrue(r.getiLength() == 5);
		assertTrue(r.getiWidth() == 2);
		
		System.out.println("Length is " + r.getiLength());
		System.out.println("Width is " + r.getiWidth());
		
		r.setiWidth(5);
		r.setiLength(4);
		
		System.out.println("Length is " + r.getiLength());
		System.out.println("Width is " + r.getiWidth());
		
		assertTrue(r.area() == 20);
		assertTrue(r.perimeter() == 18);
		
		Rectangle[] R = {new Rectangle(2, 5), new Rectangle(5, 2)};
		
		System.out.println(R[0].area());
		System.out.println(R[1].area());
		
		Arrays.sort(R);
		
		System.out.println(R[0].area());
		System.out.println(R[1].area());
	}
	
	@Test
	public void CuboidTest() {
		Cuboid c = new Cuboid(3, 3, 3);
		
		assertTrue(c.getiLength() == 3);
		assertTrue(c.getiWidth() == 3);
		assertTrue(c.getiDepth() == 3);
		
		System.out.println("Length is " + c.getiLength());
		System.out.println("Width is " + c.getiWidth());
		System.out.println("Depth is " + c.getiDepth());
		
		c.setiWidth(4);
		c.setiLength(4);
		c.setiDepth(4);
		
		System.out.println("Length is " + c.getiLength());
		System.out.println("Width is " + c.getiWidth());
		System.out.println("Depth is " + c.getiDepth());
		
		assertTrue(c.area() == 96);
		
		Assertions.assertThrows(UnsupportedOperationException.class, () -> c.perimeter());
		
		assertTrue(c.volume() == 64);
		
		ArrayList<Cuboid> C = new ArrayList<Cuboid>();
		C.add(new Cuboid(1, 2, 3));
		C.add(new Cuboid(3, 2, 1));

		System.out.println(C.get(0).area());
		System.out.println(C.get(1).area());
		
		Collections.sort(C, new SortByArea());
		
		System.out.println(C.get(0).area());
		System.out.println(C.get(1).area());
		
		C.set(0, new Cuboid(1, 2, 3));
		C.set(1, new Cuboid(3, 2, 1));

		System.out.println(C.get(0).volume());
		System.out.println(C.get(1).volume());
		
		Collections.sort(C, new SortByVolume());
		
		System.out.println(C.get(0).volume());
		System.out.println(C.get(1).volume());
		
	}

}