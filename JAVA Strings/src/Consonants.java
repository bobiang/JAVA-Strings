
public class Consonants {
	public String CountReplace(String str) {
		if(str==null) {
			return null;
		}
		
		String result="";
		int count=0;
		for(int i=0;i<str.length();i++) {
			char letter=str.charAt(i);
			char upperLetter=Character.toUpperCase(letter);
			if(upperLetter=='A'||upperLetter=='E'||upperLetter=='I'||upperLetter=='O'||upperLetter=='U') {
				result=result+letter;
			}
			else if(upperLetter<='Z'&&upperLetter>='A') {
				result=result+'*';
				count++;
			}else {
				result=result+letter;
			}
			
		}
		System.out.println("there are "+count);
		return result;
	}
	
	public static void main(String[] args) {
		Consonants consonants=new Consonants();
		System.out.println(consonants.CountReplace("@@aabb%% ii123kk"));
	}
}
