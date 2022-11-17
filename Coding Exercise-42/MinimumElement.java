import java.util.Scanner;
public class MinimumElement {
    // write code here
    private static int readInteger(){
        Scanner inp=new Scanner(System.in);
        int a=inp.nextInt();
        return a;
    }
    private static int[] readElements(int p){
        Scanner inp=new Scanner(System.in);
        int[] arr=new int[p];
        for(int i=0;i<arr.length;i++){
            arr[i]=inp.nextInt();
        }
        return arr;
    }
    private static int findMin(int[] a){
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
    }
}