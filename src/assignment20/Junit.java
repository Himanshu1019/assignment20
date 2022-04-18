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

	public static void validlast(String str1)
	{
		String regex="[A-Z ][a-z]*";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(str1);
		if(m.find())
		{
			System.out.println("yes valid lastname ");
		}
		else 
		{
			System.out.println("no not a valid lastname ");
		}
	}
		public static void validemail(String str1)
		{
			String regex="[a-zA-Z0-9.][a-zA-Z0-Hi9]@[a-zA-Z]+([.][a-zA-Z0-9]+)+";
			Pattern p=Pattern.compile(regex);
			Matcher m=p.matcher(str1);
			if(m.find())
			{
				System.out.println("yes valid emailid ");
			}
			else 
			{
				System.out.println(" no not a valid mailid ");
			}
			
		}
			public static void validnumber(String number )
			{
				String check="(0/91)?[7-9][0-9]{9}";
				Pattern p=Pattern.compile(check);
				Matcher m=p.matcher(number);
				if(m.find())
				{
					System.out.println("yes valid mobile number ");
				}
				else 
				{
					System.out.println(" no not a valid mobile number ");
				}
				
			}
			public static void validpassword(String number )
			{
				String check="[@$%][a-bA-Z0-9]";
				Pattern p=Pattern.compile(check);
				Matcher m=p.matcher(number);
				if(m.find())
				{
					System.out.println("yes valid password");
				}
				else 
				{
					System.out.println(" no not a valid password ");
				}

		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("please enter the firstname ");
		String firstname=s.nextLine();
		validfirst(firstname);
		System.out.println("please enter the lastname ");
		String lastname=s.nextLine();
		validlast(lastname);
		System.out.println("please enter the email id ");
		String mailid=s.nextLine();
		validemail(mailid);
		System.out.println("please enter the mobile number  ");
		String number=s.nextLine();
		validnumber(number);
		System.out.println("please enter the password  ");
		String pass=s.nextLine();
		validpassword(pass);
		
	}

}
