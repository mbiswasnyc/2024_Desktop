package Practice;

public class MethodArraySize {
    public static void main(String[] args) {
        int[] array1 = {2,6,3,7,9,6,4,6,4,8,6,3,67,34,2};
        int[] array2 = {9,7,12,12,5,23,8,7,4,4,6,5,2,4,6};

        arraySize(array1,array2);
    }

    public static void arraySize(int[] a1, int[] a2){
        if(a1.length>a2.length){
            System.out.println("array1 is Large");
        }else if(a2.length>a1.length){
            System.out.println("array2 is Large");
        }else{
            System.out.println("Both arrays are equal!");
        }
    }
}
