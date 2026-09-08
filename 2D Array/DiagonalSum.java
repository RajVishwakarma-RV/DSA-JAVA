//public class DiagonalSum {
//public class DiagonalSum(int matrix[][]) { yaha toh kya kiya hai tune salee
public class DiagonalSum{
    public static int calSum(int matrix[][]){ // yaha par int kha gaya tha 
    int sum =0;
    for(int i = 0; i<matrix.length; i++){
      //for(int j = 0; j<matrix.length[0]; j++){
       for(int j = 0; j<matrix[0].length; j++){ // line 6 to 9 is for ll
        //if(matrix[i]==matrix[j]){
         if(i==j){
            sum+=matrix[i][j];
        }else if(i+j==matrix.length-1){ // ye wali line likhi hi nahi thi
            sum+=matrix[i][j];}
        }}
        return sum;                                     
    }

public static void main(String[] args) {
    int matrix[][] = {{1,2,3,4}
                       ,{5,6,7,8}
                      ,{9,10,11,12}
                      ,{13,14,15,16}};
    System.out.println(calSum(matrix));                  
}
}
// time Complexity is O(n^2) so we write another code