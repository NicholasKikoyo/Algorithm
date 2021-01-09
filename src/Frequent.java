import java.util.HashMap;
import java.util.Map;

public class Frequent {
    public static void main(String[] args) {

        int [] intArray = {10, 20, 10, 20, 30, 20, 20};
        System.out.println(frequent(intArray));
    }

    public static int frequent(int[] intArray){

        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        int max =0;
        int value = 0;

        for(int i : intArray){
            Integer integer = count.get(i);
            if (integer == null)
                count.put(i,1);
            else
                count.put(i,integer + 1);
            if (count.get(i) > max){
                max = count.get(i);
                value = i;
            }
        }
        return value;
    }
}
