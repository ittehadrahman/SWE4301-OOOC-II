public class Song
{
    public static String verse( int numberOfBottles)
    {
        String verses = "";
        if (numberOfBottles == 2)
        {
            verses = "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                    "Take one down and pass it around, 1 bottle of beer on the wall.\n";
        }
        else if(numberOfBottles == 1)
        {
            verses = "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                    "Take one down and pass it around, no more bottles of beer on the wall.\n";
        }
        else if(numberOfBottles == 0)
        {
            verses = "No more bottles of beer on the wall, no more bottles of beer.\n" +
                    "Go to the store and buy some more, 99 bottles of beer on the wall.";
        }
        else if(numberOfBottles>99)
        {
            verses = "Excess bottles of beer.\n";
        }
        else if(numberOfBottles<0)
        {
            verses = "Beer bottles cannot be negative. You are vey drunk.";
        }
        else
        {
            verses = numberOfBottles + " bottles of beer on the wall, " + numberOfBottles + " bottles of beer.\n" +
                "Take one down and pass it around, " + (numberOfBottles-1) + " bottles of beer on the wall.\n";
        }
        return verses;
    }
    public String FullBeerSong()
    {
        String beerString = "";
        for (int i = 99; i >= 0; i--)
        {
            beerString += verse(i);
        }
        return beerString;
    }
    public String PartialBeerSong(int start, int end)
    {
        String beerString = "";
        for (int i = end; i >= start; i--)
        {
            beerString += verse(i);
        }
        return beerString;
    }
}
