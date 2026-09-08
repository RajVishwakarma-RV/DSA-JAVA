public  class Fibonacci{
    public static int R(int n){
        if(n==0 || n==1){
            return n;
        }
        int s = R(n-1);
        int t = R(n-2);
        return s+t;
    }
public static void main(String[] args) { 
   System.out.println(R(10)); 
}}