import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String original = "katsudon";
        int length = original.length();
        // System.out.println(length); // 7

        String[] ab = original.split("");
        // System.out.println(ab[0]);
        List<String> reverse = new ArrayList<>();

        for (int i = 1; i <= original.length(); i++){
            // System.out.println(ab[length - i]);
            reverse.add(ab[length - i]);
        }

        String reverseString = "";
        for (String s: reverse){
            reverseString += s;
        }

        System.out.println(reverseString); // nodustak

        String japaneseOriginal = "日本語がひっくりかえる";
        char[] reverseChar = StringToCharReverse.charToString(japaneseOriginal);
        japaneseOriginal = new String(reverseChar);
        System.out.println(japaneseOriginal); // るえかりくっひが語本日
    }
}
