package Cloudvandana;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//java 1.create an array with the value(1,2,3,4,5,6,7)and shuffle it.


public class Arrayshuffle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[]s= {1,2,3,4,5,6,7};
		List<Integer>intList=Arrays.asList(s);
		Collections.shuffle(intList);
		intList.toArray(s);
		System.out.println(Arrays.toString(s));		
;
		
	}

}
