
/**
 * SongDriver class is used to show how you would
 * instatiate Song objects.
 * 
 * @author Sara Kazemi
 * @version 7/11/2018
 */
public class SongDriver
{
    public static void main(String[] args)
    {
        // create a new song!
        Song s1 = new Song("Freezepop Forever", "Freezepop", 4.5);
                             // title             artist     rating
                             
        // "play" the song you just created!                     
        s1.play();
        
        // print the song's rating
        s1.printRating();
    }
}
