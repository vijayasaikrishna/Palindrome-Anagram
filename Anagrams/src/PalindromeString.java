
public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "abcdekedcba";
		System.out.println(isPalindrome(s));
		
	}

	public static boolean isPalindrome(String s) {
		
		int i= (s.length()/2);
		if(i*2==s.length())
			return evenIsPalindrome(s);		
			
			else

				return oddIsPalindrome(s);
	}
	
public static boolean evenIsPalindrome(String s) {
	System.out.println("even side");
	char[] firstHalf =new char[s.length()/2];
	
	
	char[] secondHalf=new char[s.length()/2];
	
	s.getChars(0, s.length()/2, firstHalf, 0);
	System.out.println(firstHalf);
	s.getChars(s.length()/2, s.length(), secondHalf, 0);
	
	for (int i=0 ;i< s.length()/2;i++)
	{		
		if (firstHalf[i]==secondHalf[s.length()/2-1-i])
		{	System.out.println(firstHalf[i]+"="+secondHalf[(s.length()/2)-1-i]);
		System.out.println();
			
			continue;
		}
		else return false;
	
	}

	return true;


}

public static boolean oddIsPalindrome(String s)
{
	System.out.println("odd side");
	int halfLength= s.length()/2;

	char[] firstHalf =new char[halfLength];
	char[] secondHalf=new char[halfLength];
	
	s.getChars(0, halfLength, firstHalf, 0);

	s.getChars(halfLength+1, s.length(), secondHalf, 0);
	
	for (int i=0 ;i<halfLength;i++)
	{		
		
		if (firstHalf[i]==secondHalf[halfLength-1-i])
			{
			System.out.println(firstHalf[i]+"="+secondHalf[halfLength-1-i]);	
			continue;
			}
			
		else return false;
	
	}
	
	return true;
}

}
