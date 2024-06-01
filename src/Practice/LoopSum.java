package Practice;

public class LoopSum {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=0; i<=100; i++){
            sum = sum + i;
            if(sum>3000){
                System.out.println(i);
                break;
            }
        }
        System.out.println("Sum is : "+sum);

    }
}
