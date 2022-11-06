public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        if(number<0){
            number*=-1;
        }
        int check=number;
        int reverse=0;
        while(number>0){
            int r=number%10;
            reverse*=10;
            reverse+=r;
            number/=10;
        }
        return check==reverse;
    }
}