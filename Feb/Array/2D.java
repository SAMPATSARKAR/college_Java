// class D{
//     public static void main(String[] args){
//         int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//         int row = arr.length;
//         int col = arr[0].length;

//         for(int i=0;i<row;i++){
//             if(i%2 == 0){
//                 for(int j=0;j<col;j++){
//                     System.out.print(arr[i][j]+" ");
//                 }
//             }else{
//                 for(int j = col-1;j>=0;j--){
//                     System.out.print(arr[i][j]+" ");
//                 }
//             }
//         }
//     }
// }
//diagonal
class D {
    public static void main(String[] args){
        
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int n = arr.length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){

                if(i == j) {                  
                    System.out.print(arr[i][j] + " ");
                }
                else if(i + j == n - 1) {     
                    System.out.print(arr[i][j] + " ");n-i-1
                }
            }
        }
    }
}

