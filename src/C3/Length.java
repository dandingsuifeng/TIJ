package C3;

import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int temp = 0;
        int[] point  = new  int[N];
        int[] alength  = new  int[N];
        alength[0] = 0;
        for (int i = 0;i<N;i++){
            point[i] = sc.nextInt();
        }
        int length = 0;
        int min = 999;
        for (int i=1;i<N-1;i++){
            if (N==2){
                if(i==1){
                    alength[i]=Math.abs(point[i]-point[i-1]);
                }
            }
            else {
                for (int j = 0;j<N;j++){
                    while (j!=i&&j!=i+1){
                        length+=Math.abs(point[j]-point[j-1]);
                    }
                    if(j==i+1){
                        length+=Math.abs(point[j]-point[j-2]);
                    }
                }
            }
        }
    }
}
