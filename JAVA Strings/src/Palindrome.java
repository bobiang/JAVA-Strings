
public class Palindrome {
	public boolean ReverCompare(String str) {
		if(str==null) {
			System.out.println("its null");
			return false;
		}
		
		String result="";
		for(int i=0; i<str.length();i++) {
			result=result+str.charAt(str.length()-i-1);
		}
		 return(str==result);

	}
	
	public static void main(String[] args) {
		Palindrome palindrome=new Palindrome();
		palindrome.ReverCompare("abc");
	}
}
