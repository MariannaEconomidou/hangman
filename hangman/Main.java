package hangman;

public class Main {

	public static void main(String[] args) {
	//whatdonext is used for executing players choice
	int whatdonext; 
	//choose variable is used for accessing the main menu and saving the players choice
	Menu choose=new Menu();
	//data variable is used for keeping up with the statistics and printing them as well
	Statistics data=new Statistics();
	 //
	 Newgame gameon=new Newgame();
	 
	 System.out.println("Let's play Hangman!");
	 choose.menulist();
     whatdonext =choose.playerschoice();
     do {
        
      if(whatdonext==1)//1 is for statitics	 
      {data.PrintStats();}
         
      else if(whatdonext==2)//2 stands for new game
      {data.UpdateStats(gameon.play());}
      
      choose.menulist();
      whatdonext =choose.playerschoice();
      }while(whatdonext==1||whatdonext==2);
     System.out.println("\nSorry to see you go!See you soon..");
     
	}

}
