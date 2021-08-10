import java.util.ArrayList;

public class Question_3 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Integer a[]= {6,7,8,10,9};
		ArrayPosition obj=new ArrayPosition();
		obj.changePos(a,3,4);//3 and 4 are indices of an array
	}
}
class ArrayPosition{
	<T> void changePos(T[] a,int p1,int  p2)
	{
		
		T temp;
		//System.out.println(index2);
		temp=a[p1];
		a[p1]=a[p2];
		a[p2]=temp;
		
		for (T integer : a) {
			System.out.println(integer);
		}	
	}
}