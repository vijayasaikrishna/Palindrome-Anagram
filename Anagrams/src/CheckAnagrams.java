
public class CheckAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// assuming that the two strings are not having any character repeting
	
	String first ="abcd";
	String second="bcda";
	int[] a= new int[second.length()];
	for(int i=0;i<second.length();i++)
	{
		
		a[i]=-1;
		
	}
	
	}
	
	
	public boolean ifNotRepeat(int i,int j[]) {
		return true;
		
	}
	
	public boolean isAnagram(String first,String second, int []a)
	{
		char[] charArr=new char[first.length()];
		first.getChars(0, first.length()-1, charArr, 0);
		if(first.length()!= second.length())
			return false;
		for (int i=0;i< first.length();i++)
		{
			if(charFound(charArr[i],second)>0)
					{
						int c=charFound(charArr[i],second);
						if(!ifNotRepeat(c,a))
							return false;
						
					}
			return true;
		}
		
return true;		
		
		
	}

	public int charFound(char check,String second)
	{
		
		
		int a = second.length();
		char[] charArr= new char[a];
	
		second.getChars(0, a-1, charArr, 0);
        for (int j=0;j<a;j++)
        {
        	if(charArr[j]==check)
        	return j;
        	
        }
		
		return -2;
		
		
		
	}
	
}
