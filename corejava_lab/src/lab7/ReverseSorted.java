package lab7;
import java.util.*;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class ReverseSorted 
{
public List getSorted(int[] num)
{
	   Arrays.toString(num);
	   List<String> l=new ArrayList<>();
       for(int i=0;i<num.length;i++)
       {
    	   StringBuffer s=new StringBuffer();
    	   s.append(num[i]);
    	   s.reverse();
    	  String str=s.toString();
    	   l.add(str);
       }
       Collections.sort(l);
       return l;
}
}

