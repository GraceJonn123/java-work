public class LargestNumOfThree {
    
    public static void main(String[] args) {

    int[] numbers = {100, -1, 21};
        int largest = Integer.MIN_VALUE;
        
        for(int i =0;i<numbers.length;i++) {
            if(numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        
        System.out.println("Largest number in array is : " +largest);
    }
}