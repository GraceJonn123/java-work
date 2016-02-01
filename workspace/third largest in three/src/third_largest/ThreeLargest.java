package third_largest;
	import java.util.Arrays;
	public class ThreeLargest {
	public static void main(String[] args){
	    String strArr[] = {"kempinski", "world", "before", "lullaby"};
	    System.out.println(thirdLargest(strArr));
	}

	private static String thirdLargest(String[] strArr) {
	    // TODO Auto-generated method stub
	    int[] order = new int[strArr.length];
	    String result="";
	    for(int i=0;i<strArr.length;i++){
	        order[i]=strArr[i].length();
	    }
	    Arrays.sort(order);
	    for(int i=0;i<strArr.length;i++){
	        if(strArr[i].length()==order[order.length-3]){
	            result=strArr[i];
	        }
	    }
	    return result;
	}
	}
