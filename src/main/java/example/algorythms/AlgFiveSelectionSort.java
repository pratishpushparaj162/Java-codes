package example.algorythms;
import java.util.ArrayList;
import java.util.List;

public class AlgFiveSelectionSort {
    public static void main(String[] args) {
        List<Integer> testArray = new ArrayList<>(List.of(5, 4, 42, 1, 20, 96, 43, 43, 93, 85, 11, 113, 13));
        System.out.println(testArray);
        System.out.println(selectionSort(testArray));
    }

    public static int findSmallest(List<Integer> array) {
        Integer smallest = array.getFirst();
        int smallest_index = 0;

        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) < smallest) {
                smallest = array.get(i);
                smallest_index = i;
            }
        }
        return smallest_index;
    }

    public static List<Integer> selectionSort(List<Integer> array) {
        List<Integer> newArray = new ArrayList<>();
        int size = array.size();
        for (int i = 0; i < size; i++) {
            int smallestIndex = findSmallest(array);
            newArray.add(array.get(smallestIndex));
            array.remove(smallestIndex);
        }
        return newArray;
    }
}
