package Practice;

public class MethodLargerValueFrom2andSub {
    public static void main(String[] args) {
        int a = 200;
        int large = largerNumber(12,45,56);
        int sub = a-large;
        System.out.println("Difference is : "+sub);
    }

    public static int largerNumber(int n1, int n2, int n3){
        if(n1>n2 && n1>n3){
            return n1;
        } else if (n2>n3){
            return n2;
        }else{
            return n3;
        }
    }
}
