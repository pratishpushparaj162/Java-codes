package example.algorythms;
import java.util.OptionalInt;

public class AlgFourBinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = {1, 5, 7, 9, 12, 14, 15, 18, 19, 23, 25, 27};
        int item = 19;
        binarySearch(sortedArray, item).ifPresentOrElse(
            index -> System.out.println("Значение '" + item + "' найдено на позиции: " + index),
            () -> System.out.println("Значение не найдено")
        );
    }

    static OptionalInt binarySearch(int[] sortedArray, int item) {
        if (sortedArray == null || sortedArray.length == 0) {
            return OptionalInt.empty();
        }
        int low = 0;
        int high = sortedArray.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int guess = sortedArray[mid];
            if (guess == item) {
                return OptionalInt.of(mid);
            } else if (guess > item) {
                high = mid - 1;
            } else low = mid + 1;
        }
        return OptionalInt.empty();
    }
}
