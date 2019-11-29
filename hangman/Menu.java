package hangman;
import  java.util.Scanner;
public class Menu {
	char choicemenu;
	//main menu 
	public void  menulist()
	{
		System.out.println("\nMain Menu\n-Start a new game(N)\n-Statistics(S)\n-Exit(E)\nPlease enter your choice:");
	}
	//navigate through menu
	public int playerschoice()
	{   Scanner sc= new Scanner(System.in);
	    
		boolean notdone;
		do {
			
			choicemenu = sc.next().charAt(0);
			notdone=false;
			if(choicemenu!='E'&&choicemenu!='N'&&choicemenu!='S'&&choicemenu!='e'&&choicemenu!='n'&&choicemenu!='s') {
			System.out.println("Invalid answer;Try again.\nPlease enter your choice:");
			notdone=true;
			;}
		}while(notdone);
		
		if(choicemenu=='E'||choicemenu=='e')
		{
			return 0;
		}else if(choicemenu=='S'||choicemenu=='s')
		{return 1;}
		else {return 2;}
		
		
	}

}
