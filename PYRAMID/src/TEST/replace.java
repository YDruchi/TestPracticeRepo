package TEST;

public class replace {

	public static void main(String[] args) {
		String replace="";
		// TODO Auto-generated method stub
String s="hello1 234sd 09yd";
for(int i=0;i<s.length();i++) {
	char ch=s.charAt(i);
	if(Character.isAlphabetic(ch)) {
		replace=replace+"*";
		
		}
	else {
		replace=replace+ch;
	}
	
}

System.out.println(replace);
	}

}
