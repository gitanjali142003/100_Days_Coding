//import java.util.Arrays;

public class largestelement{
    public static void main(String args[]){
        int [] arr={10,30,40,60,20,50};
        int ans=optimallargest(arr);
        System.out.println(ans);
        System.out.println(arr.length-2);


    }
   /*  static void sortex(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

            }
            
            }

        }*/

        //optimal solution

        static int optimallargest(int[] arr){
            int largest=arr[0];
            for(int i=0;i<arr.length;i++){
                if(largest<arr[i]){
                    largest=arr[i];
                }
        
            }
            return largest;
            
        }
    }
