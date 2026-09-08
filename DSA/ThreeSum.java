import java.util.*;
class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
  int n  =  nums.length;

  for(int i=0; i<n-2; i++){
    if(i>0 && nums[i]==nums[i-1])
        continue;
 int q = i+1;
  int r = n-1;
    
    
    while(q<r){
        int sum = nums[i]+nums[q]+nums[r];
  if(sum==0){
  result.add(Arrays.asList(nums[i],nums[q],nums[r]));
  
  while(q<r && nums[q]==nums[q+1])
q++;
  while(q<r && nums[r]==nums[r-1])
r--;
  
  q++;
  r--;
  }
  else if(sum<0){
    q++;
  }else{
    r--;
  }
  }
  }
  return result;}
public static void main(String[] args) {
    int nums[] = {-1,3,2,-5,-2};
    System.out.println(threeSum(nums));
}}