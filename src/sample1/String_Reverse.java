package sample1;

public class String_Reverse {
public static void main(String[] args) {
	
	String str=" Velocity Classes";
	String rev = "";
	
	for (int i=str.length()-1; i>=0;i--) 
	{
		rev=rev+str.charAt(i);
	}
	
	System.out.println(rev);
}
}
