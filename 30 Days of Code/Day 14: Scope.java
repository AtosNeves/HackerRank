import java.io.IOException;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

class Solution {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int quantidade = input.nextInt();
        int v[] = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            v[i] = input.nextInt();
        }
        
        Arrays.sort(v);
    
        System.out.println(v[quantidade-1]-v[0]);
    
    }

}
