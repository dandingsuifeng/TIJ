package C3;

import java.util.*;
import java.io.*;

public class date {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int temp = 0;
        int[] cats  = new  int[N];
        for (int i = 0;i<N;i++){
            cats[i] = sc.nextInt();
        }
        for(int i=0;i<cats.length-1;i++) {
            for (int j = 0; j < cats.length - 1 - i; j++) {
                if (cats[j] > cats[j + 1]) {
                    temp = cats[j];
                    cats[j] = cats[j + 1];
                    cats[j + 1] = temp;
                }
            }
        }
        int a;
        int number = 0;
        a = cats[0];
        for (int i = 0;i<N;i++){
            if(a<cats[i]){
                a = cats[i];
                number++;
            }
            if (number==2||(i==N-1&&number<2)){
                System.out.println(-1);
            }

        }
    }
}
