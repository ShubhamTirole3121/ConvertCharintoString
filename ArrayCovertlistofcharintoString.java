package Schoollevel;

public class ArrayCovertlistofcharintoString {

	public static void main(String[] args) {
		
		char[] ch = new char[] {'a' ,'s','d','r'};

		String str = new String();
		
		for(int i=0; i<ch.length; i++) {
			 str = str + ch[i];
		}
        
		System.out.print(str);
	}

}
