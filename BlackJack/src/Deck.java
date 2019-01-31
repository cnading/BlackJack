import java.util.ArrayList;
import java.util.Collections;

public class Deck
	{
static ArrayList<Card> deck=new ArrayList<Card>();
public static void fillDeck()
{
	deck.add(new Card(11, "Hearts", "Ace"));
	deck.add(new Card(2, "Hearts", "Two"));
	deck.add(new Card(3, "Hearts", "Three"));
	deck.add(new Card(4, "Hearts", "Four"));
	deck.add(new Card(5, "Hearts", "Five"));
	deck.add(new Card(6, "Hearts", "Six"));
	deck.add(new Card(7, "Hearts", "Seven"));
	deck.add(new Card(8, "Hearts", "Eight"));
	deck.add(new Card(9, "Hearts", "Nine"));
	deck.add(new Card(10, "Hearts", "Ten"));
	deck.add(new Card(10, "Hearts", "Jack"));
	deck.add(new Card(10, "Hearts", "Queen"));
	deck.add(new Card(10, "Hearts", "King"));
	deck.add(new Card(11, "Diamonds", "Ace"));
	deck.add(new Card(2, "Diamonds", "Two"));
	deck.add(new Card(3, "Diamonds", "Three"));
	deck.add(new Card(4, "Diamonds", "Four"));
	deck.add(new Card(5, "Diamonds", "Five"));
	deck.add(new Card(6, "Diamonds", "Six"));
	deck.add(new Card(7, "Diamonds", "Seven"));
	deck.add(new Card(8, "Diamonds", "Eight"));
	deck.add(new Card(9, "Diamonds", "Nine"));
	deck.add(new Card(10, "Diamonds", "Ten"));
	deck.add(new Card(10, "Diamonds", "Jack"));
	deck.add(new Card(10, "Diamonds", "Queen"));
	deck.add(new Card(10, "Diamonds", "King"));
	deck.add(new Card(11, "Spades", "Ace"));
	deck.add(new Card(2, "Spades", "Two"));
	deck.add(new Card(3, "Spades", "Three"));
	deck.add(new Card(4, "Spades", "Four"));
	deck.add(new Card(5, "Spades", "Five"));
	deck.add(new Card(6, "Spades", "Six"));
	deck.add(new Card(7, "Spades", "Seven"));
	deck.add(new Card(8, "Spades", "Eight"));
	deck.add(new Card(9, "Spades", "Nine"));
	deck.add(new Card(10, "Spades", "Ten"));
	deck.add(new Card(10, "Spades", "Jack"));
	deck.add(new Card(10, "Spades", "Queen"));
	deck.add(new Card(10, "Spades", "King"));
	deck.add(new Card(11, "Clubs", "Ace"));
	deck.add(new Card(2, "Clubs", "Two"));
	deck.add(new Card(3, "Clubs", "Three"));
	deck.add(new Card(4, "Clubs", "Four"));
	deck.add(new Card(5, "Clubs", "Five"));
	deck.add(new Card(6, "Clubs", "Six"));
	deck.add(new Card(7, "Clubs", "Seven"));
	deck.add(new Card(8, "Clubs", "Eight"));
	deck.add(new Card(9, "Clubs", "Nine"));
	deck.add(new Card(10, "Clubs", "Ten"));
	deck.add(new Card(10, "Clubs", "Jack"));
	deck.add(new Card(10, "Clubs", "Queen"));
	deck.add(new Card(10, "Clubs", "King"));
}
public static void shuffleDeck()
{
	Collections.shuffle(deck);
}
		
	}
