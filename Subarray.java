import java.util.*;
public class Subarray{
    public static void Subarrays(int arr[]){
        int i=0;
        int j=i+1;
         
        while(i<arr.length && j<=arr.length){
           
            for(int k=i;k<j;k++){
                System.out.print(arr[k]+ " ");
            }
            
            System.out.println();
            if(j==arr.length){
                i++;
                j=i+1;
            }
            else{
                j++;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4};
        Subarrays(arr);
    }
    
}
