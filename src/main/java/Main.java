import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = createArrayWithNumbers(1000);
        Arrays.sort(numbers);
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.search(numbers, 67));
    }

    private static int[] createArrayWithNumbers(int numbersQuantity) {
        int[] numbers = new int[numbersQuantity];
        for (int i = 0; i < numbersQuantity; i++) {
            numbers[i] = i;
        }
        return numbers;
    }
}
