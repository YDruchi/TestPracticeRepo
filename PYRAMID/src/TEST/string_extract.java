package TEST;

public class string_extract {
	public static void main(String[] args) {
		
	
	String s="your itnery has been booked,ticket number is :IT05071987";
	String[] snew=s.split(":");
	String snew1=snew[1];
	System.out.println(snew1);
	char ch;	
	String reverse="";

	for(int i=0;i<s.length();i++) 
		
	{
		ch=s.charAt(i);
		reverse=ch+reverse;
	}
System.out.println(reverse);
}}
