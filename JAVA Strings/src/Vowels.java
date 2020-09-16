
public class Vowels {

	public void CountVowels(String str) {
		if(str==null) {
			System.out.println("null input");
			return;
		}
		int result=0;
		for(int i=0; i<str.length(); i++) {
			char letter=Character.toUpperCase(str.charAt(i));
			if(letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U') {
				result++;
			}
		}
		
		System.out.println("There are "+result+" Vowel(s)");
	}
	
	public static void main(String[] args) {
		Vowels vowels=new Vowels();
		vowels.CountVowels("abcdefghijkl");
	}
}
