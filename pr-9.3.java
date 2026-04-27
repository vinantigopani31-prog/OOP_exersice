import java.util.LinkedList;
import java.util.Scanner;

class MusicPlaylist {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> playlist = new LinkedList<String>();

        System.out.print("How many songs to add: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter Song " + i + ": ");
            playlist.add(sc.nextLine());
        }

        System.out.println("\nFull Playlist:");
        System.out.println(playlist);

        String firstSong = playlist.removeFirst();
        System.out.println("\nPlaying First Song: " + firstSong);
        System.out.println("Playlist After Playing First Song:");
        System.out.println(playlist);

        String lastSong = playlist.removeLast();
        System.out.println("\nSkipped Last Song: " + lastSong);
        System.out.println("Playlist After Skipping Last Song:");
        System.out.println(playlist);

        sc.close();
    }
}

/* output 
How many songs to add: 4
Enter Song 1: Believer
Enter Song 2: Perfect
Enter Song 3: Shape of You
Enter Song 4: Faded

Full Playlist:
[Believer, Perfect, Shape of You, Faded]
Playing First Song: Believer
Playlist After Playing First Song:
[Perfect, Shape of You, Faded]

Skipped Last Song: Faded
Playlist After Skipping Last Song:
[Perfect, Shape of You] */