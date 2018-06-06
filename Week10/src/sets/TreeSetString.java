package sets;

//treeset string example  

import java.util.Set;
import java.util.TreeSet;

public class TreeSetString
{
	public static void main(String args[])
	{
		Set<String> stringSet = new TreeSet<>();
		stringSet.add("ab");
		stringSet.add("AB");
		stringSet.add("23");
		
		System.out.println(stringSet);
	}
}