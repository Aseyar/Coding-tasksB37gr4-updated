package SeyarTaskSolutions;

public class Odd_or_even {

    /*
    Write  a method which can identifies given number is even or odd
        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"

     */
        // Method to identify if a number is even or odd
        public static String identify(int number) {
            if (number % 2 == 0) {
                return "Even";
            } else {
                return "Odd";

            }
        }

       public static void main(String[] args) {
            // Test the method
            System.out.println(identify(5));  // Output: "Odd"
            System.out.println(identify(9));  // Output: "Even"
            System.out.println(identify(7));
            System.out.println(identify(8));

        }
    }

