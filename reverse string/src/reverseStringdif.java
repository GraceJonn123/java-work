import java.util.*;
public class reverseStringdif {
	public static void main(String[] args){
		String initial ="";
		String reverse ="";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string");
		initial = input.nextLine();
		int length = initial.length();
	for (int i = length -1;i>=0; i--)
		reverse=reverse +initial.charAt(i);
	System.out.println(reverse);
	}
}
