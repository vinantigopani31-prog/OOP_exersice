import java.io.*;

class StudentFile {
    public static void main(String args[]) {
        FileWriter fw = null;
        BufferedReader br = null;

        try {
            fw = new FileWriter("students.txt");

            fw.write("101 Reema 85\n");
            fw.write("102 Amit 78\n");
            fw.write("103 Neha 92\n");

            fw.close();

            FileReader fr = new FileReader("students.txt");
            br = new BufferedReader(fr);

            String str;

            System.out.println("Student Records:");

            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        }

        catch (IOException e) {
            System.out.println("File Error: " + e);
        }

        finally {
            try {
                if (fw != null)
                    fw.close();

                if (br != null)
                    br.close();
            }

            catch (IOException e) {
                System.out.println("Closing Error: " + e);
            }
        }
    }
}

/*output 
Student Records:
101 Reema 85
102 Amit 78
103 Neha 92 */