import java.util.Scanner;
class pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for(int i=0;i<n;i++){
        //     // for(int j=0;j<i+1;j++){
        //     //     System.out.print("*");
        //     // }
        //     // System.out.println();
            
        //         for(int j=0;j<n-i;j++){
        //             System.out.print("*");
        //         }
        //         System.out.println();
        // }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n-i;j++){
        //         System.out.print(" ");
        //     }

        //     for(int k=0;k<i+1;k++){
        //         System.out.print("*");
        //     }
        //     for(int l=0;l<i;l++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    /////////
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int l=0;l<n-i;l++){
        //         System.out.print("*");
        //     }

        //     for(int k=0;k<n-i;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n-i;j++){
        //         System.out.print(" ");
        //     }

        //     for(int k=0;k<i+1;k++){
        //         System.out.print("*");
        //     }
        //     for(int l=0;l<i;l++){
        //         System.out.print("*");
        //     }
        //     System.out.println();

        // }
        // for(int c=0;c<n;c++){
        //     for(int m=0;m<c+1;m++){
        //         System.out.print(" ");
        //     }
        //     for(int x=0;x<n-c-1;x++){
        //         System.out.print("*");
        //     }

        //     for(int y=0;y<n-c;y++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    //     for(int i=0;i<n;i++){
    //         if(i==0 || i==n-1){
    //             for(int k=0;k<n;k++){
    //                 System.out.print("*");
    //             }
    //             System.out.println();
    //         }else{
    //             for(int j=0;j<n;j++){
    //                 if(j==0 || j==n-1){
    //                     System.out.print("*");
    //                 }else{
    //                     System.out.print(" ");
    //                 }
    //             }
    //         System.out.println();

    //     }
    // }
    for(int i=0;i<n;i++){
        for(int j=0;j<i+1;j++){
            System.out.print(i+1);
        }
        System.out.println();
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<i+1;j++){
            System.out.print(j+1);
        }
        System.out.println();
    }
}
}
