
public class ArmstrongNumber100_999 {
	public static void main(String[] args) {
		int remainder,result,temp;
		 
		 for(int i = 100; i <= 999; i++)
	        {
	            temp= i;
	             result = 0;
	            while(temp > 0)
	            {
	                remainder = temp % 10;
	                result = result + (remainder* remainder * remainder);
	                temp= temp/ 10;
	            }
	            if(result== i)
	            {
	                System.out.print(i+" ");
	            }
	           
	        }
	}

}
