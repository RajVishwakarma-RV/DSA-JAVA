public class Palindrome{
    public static boolean Pali(int x) {
        
      if (x < 0) 
        return false;
    int n =x;
      int rev =0;
       while(n>0){
        int r = n%10;
         rev = rev*10+r;
        n=n/10;}
        if(rev==x){
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        int x = 121;
        System.out.println(Pali(x));
    }
    }
