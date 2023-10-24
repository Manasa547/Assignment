// Enter a Roman Number as input and convert it to an integer. (ex IX = 9)

package Java_assignment1;

public class Roman_to_integer {
    
    public static void main(String[] args) {
            String romanNumeral = "IX"; // Example Roman numeral input
            int integerValue = romanToInt(romanNumeral);
            System.out.println("Integer value of " + romanNumeral + " is: " + integerValue);
        }
    
        public static int romanToInt(String s) {
            int result = 0;
            int prevValue = 0;
    
            for (int i = s.length() - 1; i >= 0; i--) {
                char c = s.charAt(i);
                int currValue = 0;
    
                switch (c) {
                    case 'I':
                        currValue = 1;
                        break;
                    case 'V':
                        currValue = 5;
                        break;
                    case 'X':
                        currValue = 10;
                        break;
                    case 'L':
                        currValue = 50;
                        break;
                    case 'C':
                        currValue = 100;
                        break;
                    case 'D':
                        currValue = 500;
                        break;
                    case 'M':
                        currValue = 1000;
                        break;
                }
    
                if (currValue < prevValue) {
                    result -= currValue;
                } else {
                    result += currValue;
                }
                prevValue = currValue;
            }
    
            return result;
        }
    }
    
    

