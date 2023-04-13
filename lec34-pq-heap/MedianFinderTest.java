import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MedianFinderTest {

	@Test
	public void test1() {
		MedianFinder md = new MedianFinder();
		md.addNum(1);    // arr = [1]
		md.addNum(2);    // arr = [1, 2]
		assertEquals(1.5, md.findMedian());   // return 1.5 (i.e., (1 + 2) / 2)
		md.addNum(3);    // arr[1, 2, 3]
		assertEquals(2.0, md.findMedian()); // return 2.0
		md.addNum(10);
		md.addNum(20);
		assertEquals(3.0, md.findMedian());
	}
	
	@Test
	public void test2() {
		MedianFinder md = new MedianFinder();
		md.addNum(-1);   
		md.addNum(-2);   
		md.addNum(-3);   
		assertEquals(-2.0, md.findMedian());
	}

	@Test
	public void test3() {
		MedianFinder md = new MedianFinder();
		md.addNum(12);   
		md.addNum(10);   
		md.addNum(13);   
		assertEquals(12.0, md.findMedian());
		md.addNum(11);
		md.addNum(5);   
		assertEquals(11.0, md.findMedian());
	}

}
