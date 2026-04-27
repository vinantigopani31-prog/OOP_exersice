import java.io.*;

class FileDataCount {
    public static void main(String args[]) {
        BufferedReader br = null;

        int lines = 0, words = 0, characters = 0;

        try {
            FileReader fr = new FileReader("data.txt");
            br = new BufferedReader(fr);

            String str;

            while ((str = br.readLine()) != null) {
                lines++;

                String arr[] = str.trim().split("\\s+");

                if (!str.trim().equals(""))
                    words += arr.length;

                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) != ' ')
                        characters++;
                }
            }

            System.out.println("Total Lines = " + lines);
            System.out.println("Total Words = " + words);
            System.out.println("Total Characters = " + characters);
        }

        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        catch (IOException e) {
            System.out.println("Reading error");
        }

        finally {
            try {
                if (br != null)
                    br.close();
            }

            catch (IOException e) {
                System.out.println("Closing error");
            }
        }
    }
}

/*output 
Total Lines = 3
Total Words = 12
Total Characters = 45 */