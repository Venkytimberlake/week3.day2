package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class FindintersectionSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr1= {1,3,5,6,7};
int[] arr2= {2,3,4,6,7};
	int a=arr1.length;
	int b=arr2.length;
	Set<Integer> Unique=new HashSet<Integer>();
	System.out.println("The intersection of two arrays are:");
	for(int i=0;i<a;i++) {
		for(int j=0;j<b;j++) {
			if(arr2[j]==arr1[i]);
			System.out.println(arr1[i]);
			break;
		}
	}
	
	
	}

}
