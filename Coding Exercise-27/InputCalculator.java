import java.util.Scanner;
 
public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        int XX=0;
        long YY=0;
        float counter=0;
        Scanner obj=new Scanner(System.in);
        while(obj.hasNextInt()){
            int a=obj.nextInt();
            counter++;
            XX+=a;
            YY=Math.round(XX/counter);
        }
            System.out.println("SUM = "+XX+" AVG = "+YY);
    }
}