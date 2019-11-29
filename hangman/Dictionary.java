package hangman;
import java.util.Random;

public class Dictionary {
Random rand = new Random(); 
String dictrionaryword;
private  String getWord(int index)
 { 
 switch(index) {
 case 0: return "UNIVERSITY";
 case 1: return "COMPUTER";
 case 2: return "LAPTOP";
 case 3: return "HEADPHONES";
 case 4: return "FUZZY";
 case 5: return "DOG";
 case 6: return "KEYHOLE";
 case 7: return "TELEPHONE";
 case 8: return "PRINTER";
 case 9: return "BUILDING";
 case 10:return "BIRTHDAY";
 case 11:return "MODIFY";
 case 12:return "HAT";
 case 13:return "MATRIX";
 case 14:return "SYSTEM";
 case 15:return "ECONOMY";
 case 16:return "SCREAM";
 case 17:return "FRINGE:";
 case 18:return "RINGTONE";
 case 19:return "DIGIT";
 case 20:return "SENTINEL";
 case 21:return "REVOLUTION";
 case 22:return "UNDERWOLRD";
 case 23:return "PIANO";
 case 24:return "GARLIC";
 case 25:return "RESONANCE";
		 
 default: return "Illegal index";
  }}
//gets random word

public String RandomWordGenerator()
{ int randi = rand.nextInt(1000)%26;

 return getWord(randi);	 
}

}
