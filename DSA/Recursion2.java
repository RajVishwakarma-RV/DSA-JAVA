public class Recursion2 {
    public static void sum(int n){
 if(n==1){
    System.out.println(" "+n);
    return;}
 System.out.print(" "+n+" ");
 sum(n-1);
    }
    public static void main(String [] args){
        
        sum(10);
    }
}
