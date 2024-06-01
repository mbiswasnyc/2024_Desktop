package Practice;

public class OddNumberArray {
    public static void main(String[] args) {
        int[] nums = {12, 5, 3, 5, 24, 7, 22, 51, 16, 9, 14};
        for(int i=0; i< nums.length; i++){
            if(nums[i]%2==1){
                System.out.println(nums[i]);
            }
        }
    }
}
