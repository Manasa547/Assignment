/**Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet
from a-z)**/

package Java_assignment1;

public class Pangram_or_not {

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog"; // Example input
        boolean isPangram = isPangram(input.toLowerCase());
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String s) {
        boolean[] alphabet = new boolean[26];
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                if (!alphabet[index]) {
                    alphabet[index] = true;
                    count++;
                }
            }
        }

        return count == 26;
    }
}

    

