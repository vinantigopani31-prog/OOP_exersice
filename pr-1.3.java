import java.util.* ;
public class Pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch = sc.next().charAt(0);
        if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
        {
            System.out.println(ch + " is a Vowel ");
        }
        else
        {
            System.out.println(ch + " is a Consonant ");
        }
        sc.close();
    }
}

/*output:
Enter a character : 
a
a is a Vowel 
Enter a character : 
s
s is a Consonant */