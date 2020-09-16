
public class LastLetterCount{
	
	public void Switch(String str){
		if(str==null) {
			System.out.println("its null");
			return;
		}
		
		String[] words=str.split("\\P{Alpha}+");
		
		char first=' ';
		int mark=-1;
		int countS=0;
		int countY=0;
		for (int i=0;i<words.length;i++) {
			if(first==' ') {
				if(words[i].charAt(words[i].length()-1)=='s') {
					first='s';
					mark=i;
					countS++;
				}else if(words[i].charAt(words[i].length()-1)=='y') {
					first='y';
					mark=i;
					countY++;
				}
			}else {
				if(words[i].charAt(words[i].length()-1)=='s'&&first=='y') {
					String temp=words[mark];
					words[mark]=words[i];
					words[i]=temp;
					countS++;
				}else if(words[i].charAt(words[i].length()-1)=='y'&&first=='s'){
					String temp=words[mark];
					words[mark]=words[i];
					words[i]=temp;
					countY++;
				}
			}

		}
		for (int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}
		System.out.println("s= "+countS);
		System.out.println("y= "+countY);
		
	}
	
	public static void main(String[] args) {
		LastLetterCount lastLetterCount=new LastLetterCount();
		lastLetterCount.Switch("aaa yas sss bbb yyy yss");
	}

}
