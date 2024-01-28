package TEST;

import javax.xml.stream.events.Characters;

public class CASE_CHANGE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String S="a BOY name iS YAkshiT";
char C1;
String S1="";
int i=0;
for( i=0;i<S.length();i++) {
	char ch=S.charAt(i);

	
	if(Character.isUpperCase(ch)) {
C1=Character.toLowerCase(ch);	
S1=S1+C1;
	}
	else {
		C1=Character.toUpperCase(ch);
		S1=S1+C1;
	}

}
System.out.println(S1);

	}

}
