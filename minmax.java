import java.util.Arrays;
public class MaximumMinimum {
	public static void main(String[] args){
		int[] x = {-24,-7,2,7,3,0,5};
		
		int min = 0;
		int max = 0;
		int res[] = x;
		for(int i = 0;i<x.length;i++){
			if(i==0){
				min=x[i];
				max=x[i];
			}
			if(x[i]<min)
				min=x[i];
			if(x[i]>max)
				max=x[i];
		}
		int j = 0;
		do{
			j = 0;
			for(int z=0;z<res.length-1;z++){
				if(res[z]>res[z+1]){
					int bl = res[z];
					res[z]=res[z+1];
					res[z+1]=bl;
					j++;
				}
			}
		}
		while(j!=0);
		System.out.println("Minimum: "+min+"\nMaximum: "+max);
		System.out.println("Sorted Array:" + Arrays.toString(res));
	}
}

