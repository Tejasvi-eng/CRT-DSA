
    import java.util.*;
public class MaxSubarraySum {
    public static int Subarrays(int arr[]){
        int i=0;
        int j=i+1;
         int max_sum=Integer.MIN_VALUE;
        
        while(i<arr.length && j<=arr.length){
           int sum=0;
            for(int k=i;k<j;k++){
                
               sum+=arr[k];
            }
            max_sum=Math.max(max_sum, sum);
            
            if(j==arr.length){
                i++;
                j=i+1;
                //sum=0;
            }
            else{
                j++;
            }
        }
        return max_sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={2,-3,4,-2,2,1,-1,4};
       System.out.print(Subarrays(arr));
    }
    
}


