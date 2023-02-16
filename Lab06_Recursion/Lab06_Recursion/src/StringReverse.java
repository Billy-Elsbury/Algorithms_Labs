public class StringReverse {

    public static void main(String[] args) {
        //Testing pow Method

        //Test case 1: Hello! Test
        String test1 = "Hello!";

        String test1Output = reverseString(test1);
        System.out.println("Expected: !olleH, Output: " + test1Output);

        //Test case 2: testing test
        String test2 = "Testing";

        String test2Output = reverseString(test2);
        System.out.println("Expected: gnitseT, Output: " + test2Output);

        //Test case 3: 2 word test
        String test3 = "Hello World!";

        String test3Output = reverseString(test3);
        System.out.println("Expected: !dlroW olleH, Output: " + test3Output);
    }

    public static String reverseString(String str) {
        // Base case: if the string is empty or has only one character, return the same string
        if (str == null || str.length() <= 1) {
            return str;
        }
        // Recursive case: remove the first character and reverse the remaining string
        String reversed = reverseString(str.substring(1)) + str.charAt(0);
        return reversed;
    }
}
