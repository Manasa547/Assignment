// Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it. 

package Java_assignment1;
import java.util.Random;

public class shuffledArray {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};
        int[] shuffledArray = shuffleArray(originalArray);
        
        // Print shuffled array
        for (int num : shuffledArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] shuffleArray(int[] array) {
        Random random = new Random();
        int[] shuffledArray = array.clone();
        
        // Start from the last element and swap one by one
        for (int i = shuffledArray.length - 1; i > 0; i--) {
            // Pick a random index from 0 to i
            int j = random.nextInt(i + 1);

            // Swap array[i] with the element at random index
            int temp = shuffledArray[i];
            shuffledArray[i] = shuffledArray[j];
            shuffledArray[j] = temp;
        }
        
        return shuffledArray;
    }
}
