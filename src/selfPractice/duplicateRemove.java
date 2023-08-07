package selfPractice;

public class duplicateRemove {

    public static void main(String[] args) {
        int[] array = {7, 2, 3, 2, 4, 5, 3, 6, 7, 8, 9, 4};

        int[] uniqueArray = removeDuplicates(array);

        // Printing the unique elements
        System.out.println("Unique elements:");
        for (int value : uniqueArray) {
            System.out.print(value + " ");
        }
    }

    public static int[] removeDuplicates(int[] array) {
        int n = array.length;
        int[] tempArray = new int[n];
        int tempIndex = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < tempIndex; j++) {
                if (array[i] == tempArray[j]) {

                    isDuplicate = true;
                    break;
                }

            }

            if (!isDuplicate) {
                tempArray[tempIndex] = array[i];
                tempIndex++;
            }
        }

        // Create a new array with the exact size of the unique elements
        int[] uniqueArray = new int[tempIndex];
        System.arraycopy(tempArray, 0, uniqueArray, 0, tempIndex);

        return uniqueArray;
    }
}
