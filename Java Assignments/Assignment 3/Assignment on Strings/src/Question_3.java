
public class Question_3 {

	public static void main(String[] args) {
		String str="Java String pool refers to collection of Strings which are stored in heap memory";
		String str1="java string pool refers to collection of strings which are stored in heap memory";
		//lowercase
		System.out.println("1.Lower case:"+str.toLowerCase());
		//uppercase
		System.out.println("2.Upper case:"+str.toUpperCase());
		//replace a with $
		System.out.println("3.Replacing a with $:"+str.replace("a", "$"));
        //check "collection" word in a String
		if(str.contains("collection"))
		{
		System.out.println("4.The word \"collection\" present in String");
		}
		else
		{
			System.out.println("4.The word \"collection\" not present in String");
		}
		if(str.equals(str1))
		{
			System.out.println("5.str1 is equal to str");
		}
		else
		{
			System.out.println("5.str1 is not equal to str");
		}
		//using equalsIgnoreCase
		if(str.equalsIgnoreCase(str1))
		{
			System.out.println("6.str1 is equal to str");
		}
		else
		{
			System.out.println("6.str1 is not equal to str");
		}
		
			
	}

}
