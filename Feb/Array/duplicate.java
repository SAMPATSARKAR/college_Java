import java.util.Scanner;
class duplicate{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,3,6,5};
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=arr[i]^i;
        // }
        // System.out.printf("%d ",sol);
        for(int i=0;i<arr.length;i++){
            int index = arr[i]-1;
            if(arr[index]<0){
                System.out.printf("%d ",index+1);
            }else{
                arr[index]=-1;
            }
        }
    }
}