package lab7;
import java.util.HashMap;
public class HashSquares 
{
public static HashMap getSquares(int[] a)
{
	HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
	for(int i:a)
	{
		map.put(i, i*i);
	}
	return map;
}
}
