public class BinarySearch {

    public int search(int[] array, int value) {
        int result = -1;
        int minIndex = 0;
        int maxIndex = array.length - 1;
        boolean searching = true;
        while (searching) {
            int searchIndex = (minIndex + maxIndex) / 2;
            if (array[searchIndex] == value) {
                result = array[searchIndex];
                return result;
            } else if (array[searchIndex] > value) {
                maxIndex = searchIndex - 1;
            } else {
                minIndex = searchIndex + 1;
            }
            if (searchIndex == maxIndex) {
                System.out.println("Number not found");
                searching = false;
            }
        }
        return result;
    }
}
