public class SharedDigit {
    public static boolean hasSharedDigit(int a,int b){
        if((a>=10 && a<=99) && (b>=10 && b<=99)){
            while(a>0){
                int bb=b;
                int r=a%10;
                while(b>0){
                   int rr=b%10;
                   if(rr==r){
                       return true;
                   }
                   b/=10;
                }
                b=bb;
                a/=10;
                
            }
            return false;
        
        }
        else{
            return false;
        }
        
    }
}