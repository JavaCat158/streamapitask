package stream;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> newlist = new ArrayList<>();
        int size = intList.size();
        for (int i = 0; i < size; i++) {
            if (intList.get(i) % 2 == 0 && intList.get(i) > 0) {
                newlist.add(intList.get(i));
            }
        }

        int low = 0;
        int high = newlist.size() - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (newlist.get(low) < newlist.get(mid)) {
                low++;
            }

            if (newlist.get(high) > newlist.get(mid)) {
                high--;
            }

            if (low <= high) {
                int temp = newlist.get(low);
                newlist.set(low, newlist.get(high));
                newlist.set(high, temp);
            }
        }
        System.out.println(newlist);
    }
}
