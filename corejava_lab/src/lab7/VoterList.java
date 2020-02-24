package lab7;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
public class VoterList 
{
public List voterList(HashMap<Integer,LocalDate> a)
{
	ArrayList<Integer> id=new ArrayList<>(a.keySet());
	{
		for(int i:id)
		{
			LocalDate today=LocalDate.now();
			LocalDate birthday=a.get(i);
			Period p=Period.between(birthday,today);
			if(p.getYears()>18)
			{
				id.add(i);
			}
		}
	}
	return id;
}
}
