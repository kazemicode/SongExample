
/**
 * Class Song
 * 
 * @author Sara Kazemi
 * @version This version has two constructors and no 
 * other methods.
 */
public class Song
{
    // instance variables 
    private String title;
    private String artist;
    private double rating;  // rating on iTunes -- half stars possible
    
   
     
    /**
     * Three argument Constructor for objects of class Song
     * @param String title: song title
     * @param String artist: artist name 
     * @param double rating: number of stars on iTunes
     * 
     */
    public Song(String myTitle, String myArtist, double myRating)
    {
        // values are passed in as parameter values and assigned to instance variables
        title = myTitle;
        artist = myArtist;
        rating = myRating;
        
    }
    
     
     /**
     * Prints the Song playing
     */
    public void play()
    {
        System.out.println("Now playing: " + this); // this represents the object calling the method
    }
    
     /**
     * Prints the song's rating in stars
     */
    public void printRating()
    {
        System.out.println(this + " is rated " + this.rating + " stars"); 
        
    }
    
    /**
     * @return the String "Title by artist"
     * @Override
     */
    public String toString()
    {
        return title + " by " + artist;
    }
    
}
