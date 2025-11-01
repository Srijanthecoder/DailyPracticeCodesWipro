// Reverse each word in a string
// Write a function to reverse each word in a string.
// Description :- A method has to be created that takes a string as input and extracts each word from that string and then reverse each word individually and gives the output as a reversed string. 
// Example :-
// Input:- great learning
// output :- taerg gninrael
// input :- hello guys how are you
// output :- olleh syug woh era uoy
// Explanations :- As the input string is great learning, each word has to be extracted i.e. great and learning then individually each word has to be reversed so it will be taerg and gninrael. after combining these two words into as single string the final output
// will be taerg gninrael.
package Day2;

public class ReverseWord {

    public static String reverseEachWord(String input) {
        // Split the input string by spaces to extract individual words
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        // Iterate over all words in the string
        for (int i = 0; i < words.length; i++) {
            // Reverse each word
            String reversedWord = new StringBuilder(words[i]).reverse().toString();
            result.append(reversedWord);
            // Add a space after each word except the last one
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    // Main method to test the function with given examples
    public static void main(String[] args) {
        System.out.println(reverseEachWord("Great Learning")); // Output: taerg gninrael
        System.out.println(reverseEachWord("hello guys how are you")); // Output: olleh syug woh era uoy
    }
}
