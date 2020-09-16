
public class Words {
	public void Count(String str) {
		if(str==null) {
			System.out.println("its null");
			return;
		}
		
		String[] words=str.split("\\P{Alpha}+");
		for(int i=0; i<words.length;i++) {
			System.out.println(words[i]);
		}
		
		
	}
	
	public static void main(String[] args) {
		Words words=new Words();
		words.Count("aaaaA1b$c d/()e");
	}
}
