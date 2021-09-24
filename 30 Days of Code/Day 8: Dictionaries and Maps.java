import java.io.IOException;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

class Solution {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Map<String, Integer> mapa = new HashMap<>();
        int testes = input.nextInt();
        for (int i = 0; i < testes ; i++) {
            String name = input.next();
            
            Integer num = input.nextInt();
            mapa.put(name, num);

        }
        System.out.println("sad");
        while (input.hasNext()) {
            String veri = input.next();
            if (mapa.containsKey(veri)) {
                System.out.println(veri + "=" + mapa.get(veri));
            }

            else {
                System.out.println("Not found");
            }

        }

    }

}
