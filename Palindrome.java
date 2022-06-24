package week2.day1.assignments;

public class Palindrome {
public static void main(String[] args) {
	String str = "MADAM";
	String rev = "";
	int length=str.length();
	for (int i=length-1; i>=0; i-- )
	{
		rev=rev+str.charAt(i);
	}
	if(str.equalsIgnoreCase(rev))
	{
	System.out.println("The string is palindrome");
	}
	else
	{
		System.out.println("The string is not a palindrome");
	}
}
}
