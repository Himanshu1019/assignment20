package assignment20;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Junit {
	public static void validfirst(String str1)
	{
		String regex="[A-Z ][a-z]*";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(str1);
		if(m.find())
		{
			System.out.println("yes valid firstname ");
		}
		else 
		{
			System.out.println("no not a valid firstname ");
		}
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("please enter the firstname ");
		String firstname=s.nextLine();
		validfirst(firstname);
	}

}
