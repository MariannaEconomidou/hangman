package hangman;

public class Statistics {
	int numberofvictories;
	int numberofdefeats;
	int numberofgames;
	//constructor
	public Statistics()
	{
		numberofgames=0;
		numberofvictories=0;
		numberofdefeats=0;
	}
	//printing only stats
    public void PrintStats()
    {
    	System.out.println("You have played so far "+ numberofgames + " games.");
    	System.out.println("You won "+ numberofvictories + " times.");
    	System.out.println("You lost "+ numberofdefeats + " times.");
    }
    public void UpdateStats(boolean result) {
    	if (result) {numberofvictories++;}
    	else {numberofdefeats++;}
    	numberofgames++;
    	
    }
}
