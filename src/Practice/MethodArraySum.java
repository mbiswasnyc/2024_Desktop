package Practice;

public class MethodArraySum {
    public static void main(String[] args) {
        int[] array1={12,4,3,7,13,54,7,5,9};
        int[] array2 ={32,8,6,4,11,3,76,5,23};

        // use of void type method
        sumArrayVoid(array1);
        sumArrayVoid(array2);

        // use of return type method
        int difference = sumArrayReturn(array2) - sumArrayReturn(array1);
        System.out.println("Difference of the sum of two Arrays is : "+difference);
    }

    public static void sumArrayVoid(int[]nums){
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum=sum+nums[i];
        }
        System.out.println(sum);
    }
    public static int sumArrayReturn(int[] nums){
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum=sum+nums[i];
        }
        return sum;
    }
}
