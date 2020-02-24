package lab3;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Project {
	public int getSecondSmallest(int[] arr) {		//USING LIST
		List<Integer> list=new ArrayList<>(arr.length);	
		for(int a:arr) {
			list.add(Integer.valueOf(a));
		}
		Collections.sort(list);
		return list.get(1);
	}
	public static void main(String[] args) {
		int[] arr= {5,3,2,2,7,9};
		Project gs=new Project();
		int value=gs.getSecondSmallest(arr);
		System.out.println(value);
	}
}
