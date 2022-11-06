public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }
        else{
            int last=number%10;
            int r=0;
            while(number>0){
                r=number%10;
                number/=10;
            }
            int first=r;
            int sum=first+last;
            return sum;
        }
    }
}