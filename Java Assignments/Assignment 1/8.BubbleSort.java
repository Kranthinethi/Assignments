
public class BubbleSort {
public static void main(String[] args) {
	int[] a={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	int temp;
	
	for(int i=0;i<a.length;i++)
	{
		for (int j = i+1; j < a.length; j++) {
          if(a[i]>a[j])
          {
        	  temp=a[i];
        	  a[i]=a[j];
        	  a[j]=temp;
          }
			
		}
	}
	System.out.println("Sorted Array:");
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
}
}
