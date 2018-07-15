package grid;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class learnpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String text="ABCD1234";
		String text ="TestLeaf(9876) has 20 number of employess";
		String value=text.replaceAll("[a-zA-Z]", "");
		System.out.println(value);
		//System.out.println(value.substring(1,5));
		String[] split = value.split("\\W",3);
		//System.out.println(split);
		String value1="";
		int i=0;
		for (String c : split) {
			if(i<2)
			{
			value1= value1+c;
			System.out.println(value1);
			}
			i++;
			
		}
		/*String pattern = "[A-Z]{4}[0-9]{4}";
		Pattern p =Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		System.out.println(m.matches());*/		
	}

}
