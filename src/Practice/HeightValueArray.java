package Practice;

public class HeightValueArray {
    public static void main(String[] args) {
        int[] nums = {12, 5, 3, 5, 24, 22, 51, 16, 14};
        int highest = nums[0];
        for(int i=0; i< nums.length; i++){
            if(highest<nums[i]){
                highest=nums[i];
            }
        }
        System.out.println(highest);
    }
}
