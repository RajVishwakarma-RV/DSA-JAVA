public class Array {
    public static boolean A(int n, int [] k){
       if(k.length-1<n || k[n-1]>k[n]){
        return false;
       }
       if(k[n]<k[n+1]){
        return true;
       }
    }
    public static void main(String[] args){
    int [] k = {1,2,3,4,5};
    System.out.println(0 , k);
    }
    }
    

