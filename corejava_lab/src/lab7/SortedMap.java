package lab7;
import java.util.*;
import java.util.HashMap;
import java.util.List;
public class SortedMap 
{
public List getValues(HashMap<String,Integer>s)
{
	ArrayList<Integer> a=new ArrayList<>(s.values());
	Collections.sort(a);
	return a;
}
}
