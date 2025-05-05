public class Main {
    public static void main(String[] args) {
        // Test case 1
        String[] wordNums = {"one", "two", "three"};
        WordPairList exampleOne = new WordPairList(wordNums);
        System.out.println("Example 1 pairs: " + exampleOne.getAllPairs());
        System.out.println("Number of matches: " + exampleOne.numMatches());

        
        // Test case 2
        String[] phrase = {"the", "more", "the", "merrier"};
        WordPairList exampleTwo = new WordPairList(phrase);
        System.out.println("Example 2 pairs: " + exampleTwo.getAllPairs());
        System.out.println("Number of matches: " + exampleTwo.numMatches());

        
        // Test case 3 for numMatches()
        String[] moreWords = {"the", "red", "fox", "the", "red"};
        WordPairList exampleThree = new WordPairList(moreWords);
        System.out.println("Example 3 pairs: " + exampleThree.getAllPairs());
        System.out.println("Number of matches: " + exampleThree.numMatches());
    }
}