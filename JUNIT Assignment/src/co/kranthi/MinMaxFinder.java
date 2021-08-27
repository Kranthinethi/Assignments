package co.kranthi;
import java.util.*;
public class MinMaxFinder {
	 public int[] findMinMax(int[] a) {
		
		int[] b =new int[2];
		Arrays.sort(a);
		b[0]=a[0];
		b[1]=a[a.length-1];	
		return	b;							
	}

}
