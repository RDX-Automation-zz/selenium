import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        //Rotation code begins here
        int[] rotated = new int[n];
        if(n!=k && k>n){k=k%n;}
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            for(int i=0; i<n; i++){
                if((i-k)>=0){rotated[i] = a[i-k];}
                else{rotated[i]=a[n+i-k];}
            }
        System.out.println(rotated[m]);    
        }
    }
}
