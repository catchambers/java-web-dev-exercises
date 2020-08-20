package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String mixedCaseSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures " +
                "or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String sentence = mixedCaseSentence.toLowerCase();
        System.out.println("Type string to search for: ");
        Scanner input = new Scanner(System.in);
        String searchStr = input.nextLine().toLowerCase();
        int length = searchStr.length();
        //enter word in sentence
        if (sentence.contains(searchStr)){
            //print index and length
            System.out.println("Index: " + sentence.indexOf(searchStr));
            System.out.println("Length: " + length);
            //remove word from string
            String newSentence = sentence.replace(searchStr,"");
            //print sentence again
            System.out.println(newSentence);
        } else {
            //print sentence again
            System.out.println(sentence.contains(searchStr));
        }
        input.close();

    }
}
