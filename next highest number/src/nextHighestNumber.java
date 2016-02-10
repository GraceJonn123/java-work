//make a public class
//set a main method
//set a variable int
//run
import java.util.Arrays;

public class nextHighestNumber {
	public static void main(String[] args){
		int a = 1805;
		//declare an array
		char[] num = String.valueOf(a).toCharArray();
		Arrays.sort(num);
		for (int i = num.length-1;i>=0; i--)
			//reverse of the norm,start with int i=.. so that it can have a store
			
		{
			System.out.print(num[i]);
		
	    }
		
		
	}
}
