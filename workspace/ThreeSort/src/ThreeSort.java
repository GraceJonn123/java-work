import java.util.*;
public class ThreeSort {

	/**
	 * @param args
	 */
	public static int[] Threesort( int a, int b, int c ){//making variables
				int maxfinal = Math.max(Math.max(a, b), c);
				int minfinal = Math.min(Math.min(a, b), c);
				int mid = (a + b + c) - (maxfinal + minfinal);
				int [] array = {minfinal, mid, maxfinal};
				return array;
	}
	public static void main(String[] args){
		System.out.println(Arrays.toString(Threesort(4,1,9)(6,9,3)));
	}

}
