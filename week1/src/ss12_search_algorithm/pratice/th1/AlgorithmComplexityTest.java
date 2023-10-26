package ss12_search_algorithm.pratice.th1;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        System.out.println("Initial String: ");
        String inputString = "Baodeptrai";
        System.out.println(inputString);
        int[] frequentChar = new int[255];
        for (int i = 0; i < inputString.length(); i++) {
            int ascii = inputString.charAt(i);
            frequentChar[ascii] += 1;
        }
        int max = 0;
        char character = (char) 255;
        System.out.println(character);
        for (int j = 0; j < 255; j++) {
            if (frequentChar[j] > max) {
                max = frequentChar[j];
                character = (char) j;
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
    }
}
