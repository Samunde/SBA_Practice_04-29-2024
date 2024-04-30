public class StringArithmetic {

    public static void main(String[] args) {
        String numberString = "37463738"; // Example string (divisible by 8)

                int partLength = numberString.length() / 4;

                int sum1 = 0, product = 1, sum2 = 0;
                double division = 1.0; // Initialize division with 1.0 to avoid division by zero

                // Loop through each part and perform operations
                for (int i = 0; i < numberString.length(); i += partLength) {
                    String part = numberString.substring(i, i + partLength);

                    // Convert characters to integers for calculations
                    for (char c : part.toCharArray()) {
                        if (!Character.isDigit(c)) {
                            System.out.println("Error: String contains non-numeric characters.");
                            return; // Exit if non-numeric characters are found
                        }
                        int digit = Character.digit(c, 10); // Extract digit from character
                        sum1 -= digit;
                        division /= digit; // Handle potential division by zero
                        product *= digit;
                        sum2 += digit;
                    }

                    // Print results for each part
                    System.out.println("Part " + (i / partLength + 1) + " (Subtraction): " + sum1);
                    System.out.println("Part " + (i / partLength + 1) + " (Division): " + division);
                    System.out.println("Part " + (i / partLength + 1) + " (Multiplication): " + product);
                    System.out.println("Part " + (i / partLength + 1) + " (Addition): " + sum2);
                    System.out.println(); // Add a newline for better readability
                }
            }
        }