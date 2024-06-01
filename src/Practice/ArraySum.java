package Practice;

public class ArraySum {
    // Find out sum of all the index value of an Array
    public static void main(String[] args) {
        int[] nums = {12, 5, 3, 5, 24, 22, 5, 16, 14};
        int sum =0;
        for(int i = 0; i<nums.length; i++){
            sum = sum + nums[i];
        }
        System.out.println(sum);
    }
}
