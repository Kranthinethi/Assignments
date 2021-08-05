import java.util.*;

public class SearchArray {
	public static void main(String[] args) {
    int[] a={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
    int i;
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the search element:");
    
    int ele=sc.nextInt();
    
    for (i=0;i<a.length;i++)
    {
        if(a[i]==ele)
        {
        	System.out.println("The element:"+ele+" "+"found in the array");
        	break;
        }
        else
        {
        	continue;
        }
	}
    if(i==a.length)
    {
    	System.out.println("The element:"+ele+" "+"doesn't found in the array");
    }
    
	}

}
