package week2.day1.assignments;

public class FindTypes {
	public static void main(String[] args) 
	{
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		char[] ch = test.toCharArray();
		for (int i=0;i<ch.length;i++)
		{
			if(Character.isLetter(ch[i])==true)
				letter++;
			else if(Character.isDigit(ch[i])==true)
				num++;
			else if(Character.isWhitespace(ch[i])==true)
				space++;
			else
				specialChar++;
		}
		
		System.out.println("Letters="+letter);
		System.out.println("Numbers="+num);
		System.out.println("Spaces="+space);
		System.out.println("SpecialCharacters="+specialChar);
	}


}
