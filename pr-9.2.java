import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;

class WordFrequency {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Sentence: ");
        String str = sc.nextLine();

        String words[] = str.split(" ");

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (String w : words) {
            if (map.containsKey(w))
                map.put(w, map.get(w) + 1);
            else
                map.put(w, 1);
        }

        System.out.println("\nWord Frequency:");

        Set<String> keys = map.keySet();

        for (String key : keys) {
            System.out.println(key + " -> " + map.get(key));
        }

        sc.close();
    }
}

/* output 
Enter Sentence: Java is fun and Java is powerful
Word Frequency:
Java -> 2
is -> 2
fun -> 1
and -> 1
powerful -> 1 */