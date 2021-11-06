import java.util.ArrayList;
import java.lang.*;

public class Order {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>();
        boolean b = false;

        for(int j = 0; j < 100; j++){
            int num = (int) ( Math.random() * 100 ); 
            n.add(j, num);
        }

        for(int s = n.size(); s > 1 && !b; s--){
            b = true;
            for(int i = 0; i < s-1; i++){
                if(n.get(i) > n.get(i+1)){
                    int temp = n.get(i);
                    n.set(i, n.get(i+1));
                    n.set(i+1, temp);
                    b = false;
                }
            }
        }

        System.out.println(n.toString());

    }
}
