import java.io.BufferedReader;
import java.io.FileReader;

class FileCount {
    public static void main(String args[]) {
        int characters = 0, words = 0, lines = 0;

        try {
            FileReader fr = new FileReader(args[0]);
            BufferedReader br = new BufferedReader(fr);

            String str;

            while ((str = br.readLine()) != null) {
                lines++;
                characters += str.length();

                String arr[] = str.trim().split("\\s+");

                if (!str.trim().equals("")) {
                    words += arr.length;
                }
            }

            br.close();

            System.out.println("Number of Lines = " + lines);
            System.out.println("Number of Words = " + words);
            System.out.println("Number of Characters = " + characters);
        }

        catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

/*output 
java FileCount data.txt

Number of Lines = 3
Number of Words = 12
Number of Characters = 58 */