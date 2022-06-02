package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Missingnumbers {
	public static void main(String[] args) {
	Integer[] number = {4,6,7,2,3,1,9,10,8,8,6,2};
	Set<Integer>ram=new TreeSet<Integer>();
	ram.addAll(Arrays.asList(number));
	List<Integer> lst=new ArrayList<Integer>(ram);
	for (int i = 0; i < lst.size(); i++) {
		if(lst.get(i)!=i+1) {
			System.out.println(i+1);
			break;
		}
	}
	}

}
