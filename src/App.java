import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        String[] fruits1 = new String[] { "apple", "orange", "kiwi" };
        String[] fruits2 = new String[] { "orange", "kiwi", "strawberry" };
        List<String> duplicates = new ArrayList<>();

        for (int i = 0; i < fruits1.length; i++) {
            for (int j = 0; j < fruits2.length; j++) {
                if (fruits1[i] == fruits2[j]) {
                    duplicates.add(fruits1[i]);
                }
            }
        }

        for (int i = 0; i < duplicates.size(); i++) {
            System.out.println(duplicates.get(i));
        }
    }
}
