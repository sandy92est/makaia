package grid;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearningString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str =new String("sandy");
		char[] charArray = str.toCharArray();
		System.out.println(charArray);
		int length = charArray.length;
		System.out.println(length);
		for(int i=length-1;i>=0;i--) {
			System.out.println(charArray[i]);
		}
		*/
			
	/*StringBuilder b1=new StringBuilder("peri");
	System.out.println(b1);
	System.out.println(b1.reverse());*/
		
	/*	StringBuffer s1=new StringBuffer("san");
		System.out.println(s1);
		int length = charArray.length;
		System.out.println(length);
		for(int i=length-1;i>=0;i--) {
			System.out.println(charArray[i]);
		*/
/*		
	String s1="raja";
	char[] charArray = s1.toCharArray();
	Set<Character> uniqueChar =new HashSet<Character>();
	for (char c : charArray) {
		uniqueChar.add(c);
	}*/
	
/*	String s1="raja";
	char[] charArray = s1.toCharArray();
	Set<Character> uniqueChar =new TreeSet<Character>();
	for (char c : charArray) {
		uniqueChar.add(c);
	}*/
		
	/*String s1="raja";
	char[] charArray = s1.toCharArray();
	Set<Character> uniqueChar =new LinkedHashSet<Character>();
	for (char c : charArray) {
		uniqueChar.add(c);
	}
	*/
		String s1="raja";
		char[] charArray = s1.toCharArray();
		List<Character> uniqueChar =new ArrayList<Character>();
		for (char c : charArray) {
		//	if(charArray>=0)
		
			uniqueChar.add(c);
		}
		
	
	}

}
