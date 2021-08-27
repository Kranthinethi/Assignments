package co.kranthi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinMaxFindTest {

	@Test
	void test1() {
		MinMaxFinder m=new MinMaxFinder();
		int[] expected= {2,9};
		int[] actual=m.findMinMax(new int[] {2,3,5,9});
		assertArrayEquals(expected, actual,"The actual is not not matching to expected ");
	}
	@Test
	void test2() {
		MinMaxFinder m=new MinMaxFinder();
		int[] expected= {1,9};
		int[] actual=m.findMinMax(new int[] {1,3,5,9});
		assertArrayEquals(expected, actual,"The actual is not not matching to expected ");
	}
	@Test
	void test3() {
		MinMaxFinder m=new MinMaxFinder();
		int[] expected= {100,9283};
		int[] actual=m.findMinMax(new int[] {100,328,5728,9283});
		assertArrayEquals(expected, actual,"The actual is not not matching to expected ");
	}

}
