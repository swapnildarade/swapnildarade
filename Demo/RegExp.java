package Demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {

	public static void main(String[] args)
	{
		String expect="^(?=.*[A-Z]).{8,}";
		String input="Pass@123";
		
		Pattern p= Pattern.compile(expect);
		Matcher m=p.matcher(input);
		
		if(m.matches())
		{
		System.out.println("valid Password");
		}
		else
		{
			System.out.println("Invalid Password");
		}
	}

}
