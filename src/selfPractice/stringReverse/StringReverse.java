package selfPractice.stringReverse;

public class StringReverse {
    public static int[] reverse(int[] arr){
        int l = arr.length;
        int j = 0;
        int[] result = new int[l];
        for (int i = l-1; i>=0; i--){
            result[j] = arr[i];
            j++;
        }
        return result;
    }
    public static void reverseWhileLoop(int[] arr, int start,int end){
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void printArray(int[] result) {
        for (int i : result){
            System.out.print(i + " ");}
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {2,11,5,10,7,8};
        //printArray(arr);
        System.out.println("reversed with for loop");
        int[] result = reverse(arr);
        printArray(result);
        System.out.println("reversed with while loop");
        reverseWhileLoop(arr,0,arr.length - 1);
        printArray(arr);

    }
}
