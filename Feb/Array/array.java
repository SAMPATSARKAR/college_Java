import java.util.Scanner;
import java.util.Arrays;
class array{
    public static void main(String[] args){

        // int[] arr = new int[5];
        // System.out.print((float)arr[0]);
        // for(int i=0;i<5;i++){
        //     arr[i]=i;
        // }
        // for(int j=0;j<5;j++){
        //     System.out.printf("%d",arr);
        // }
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        // for(int i=0;i<n;i++){
        //     System.out.printf("%d ",arr[i]);
        // }
        // int[] arr2 = new int[5];
        // arr2={2,8,4,3,5,6};
        // for(int i =0;i<6;i++){
        //     System.out.printf("%d ",arr[i]);
        // }
        // int[] arr = {2,8,4,3,5,6};
        // int max = Integer.MIN_VALUE;
        // int secmax = -1;
        // for(int i=0;i<arr.length;i++){
        //     if(max<arr[i]){
        //         secmax=max;
        //         max = arr[i];
        //     }else if(arr[i]>secmax && arr[i]!=max){
        //         secmax = arr[i];
        //     }
        // }
        //     System.out.printf("%d ",secmax);
        int[] arr={2,3,9,1,5,4};
        // Arrays.sort(arr);
        int target = sc.nextInt();
        // for(int i=0;i<6;i++){
        //         if(arr[i]+arr[i+1]==target){
        //             System.out.printf("%d %d",arr[i],arr[i+1]);
        //             break;
        //         }
        //     }
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==target){
                 System.out.println("found");
                 break;
            }else if(arr[i]+arr[j]>target){
                j--;
            }else{
                i++;
            }
        }
        

}
}