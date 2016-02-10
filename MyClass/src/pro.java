
public class pro {
	public static void main(String[] args){		
				int result = 0;
				for (int i = 0; i < 5; i++) {
					//here the loop will keep going till i>=5
					//each time there is a loop, i increases by 1
				  if (i == 3) { 
				     result += 30;
				     //sooooo 1+2=3...where three is,add 10 instead=13
				   } else {
				     result += i;
				     //13 + 4 =17 and thus the answer
				   }	
				}
				System.out.println(result);

	}
}
