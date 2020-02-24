package lab7;
import java.util.*;
import java.util.HashMap;
public class CountCharacter 
{
public Map countCharacter(char[] charArr)
{
	Map<Character,Integer> a=new HashMap<>();
	for(char c:charArr)
	{
		if(a.containsKey(c))
		{
			a.put(c, a.get(c)+1);
		}
		else
		{
			a.put(c, 1);
		}
	}
	return a;
}
}
