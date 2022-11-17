import java.util.Arrays;
public class ReverseArray {
    // write code here
    private static void reverse(int[] a){
        System.out.println("Array = "+ Arrays.toString(a));
        int i=0;
        int j=a.length-1;
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        System.out.println("Reversed array = " + Arrays.toString(a));
    }
}