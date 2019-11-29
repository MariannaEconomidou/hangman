package hangman;
import java.util.Scanner;
public class Newgame {
private boolean	win=false;
private int guesses;
private String playersword;//keeps track of the players word
private String secretword;//keeps secretword
Scanner sc=new Scanner(System.in);

Dictionary dicword=new Dictionary();

public boolean play() {
	char aletter;
	boolean onetryresult;
	//initialization of parameters secret word and guesses for every new game
	initializeparameters();
	
	while(guesses>0&&!win)
	{   printwordsofar(playersword);
		System.out.println("Guess a letter");
		aletter=sc.next().charAt(0);
		aletter=Character.toUpperCase(aletter);
		onetryresult=checkandchangeplayersword(aletter);//onetryresult keeps score of every try
		if(!onetryresult) guesses-=1;
		win=checkforwin();//checks if players word fits secretword
	}
	if (guesses==0) {
		System.out.println("\nHa,loser!");}
	else {
	System.out.println("\nYes win!");
	
	}
	return win;
}

//check if players word== secretword
private boolean checkforwin() {
	return playersword.equals(secretword);
}

private void printwordsofar(String wordofplayer)
{
	System.out.println("This is the word so far.."+playersword);
	System.out.println("You have "+guesses+" guesses left.");
 }

//during game itbuilds users word
private boolean checkandchangeplayersword(char letter)
{   boolean rightguess=false;
	int i;
	char[] playerswordarray=playersword.toCharArray();
	char[] secretwordarray=secretword.toCharArray();
	for(i=0;i<secretword.length();i++)
	{
		if(letter==secretwordarray[i])
		{rightguess=true;
		 playerswordarray[i]=letter;
		}
	}
	playersword=String.valueOf(playerswordarray);
	if(rightguess)
	{
		System.out.println("Bravo!Your guess;the letter "+letter+" was correct!");
	}
	else {
		System.out.println("Ooops there are no "+letter+"'s in the word.Better luck next time!");
	}
	return rightguess;
}






//initializeparameters find secret word,estimates the number of guesses and 
//the appearence of the word.
private void initializeparameters()
{   int i;
	secretword=dicword.RandomWordGenerator();
    guesses=8;
    win=false;
    //creation of the word visible by user
    //convertion of string to char table and then convertion to string
    char[] playerswordarray=secretword.toCharArray();
    for(i=0;i<secretword.length();i++) {
    playerswordarray[i] = '*';}
     playersword=String.valueOf(playerswordarray);
	
}

}
 