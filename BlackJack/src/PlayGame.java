import java.util.Scanner;
import java.util.ArrayList;

public class PlayGame
	{
		static boolean noSpellingError = true;
		static Character player;
		static Scanner userInput = new Scanner(System.in);
		static Scanner userInputInt = new Scanner(System.in);
		static int randomNum = (int) (Math.random() * Deck.deck.size() - 1);
		static ArrayList<Card> playerHand = new ArrayList<Card>();
		static ArrayList<Card> computerHand = new ArrayList<Card>();
		static boolean playerWantsToPlay = true;
		static int playerTotal = 0;
		static int computerTotal = 0;
		static int bet = 0;

		public static void main(String[] args)
			{
				Deck.fillDeck();
				Deck.shuffleDeck();
				greetings();
				while (playerWantsToPlay == true)
					{
						makeBets();
						hitOrStay();
					}
			}

		public static void greetings()
			{
				player = new Character("", 0, 200, 0);
				System.out.println("Welcome to Black Jack!");
				System.out.println("(Press Enter to Continue)");
				userInput.nextLine();
				System.out.println("Let's begin, what is your name?");
				System.out.println("(Case Sensitive)");
				String name = userInput.nextLine();
				System.out.println("To confirm your name is " + name);
				System.out.println("Yes or No");
				String response = userInput.nextLine();
				if (response.equals("Yes") || response.equals("yes"))
					{
						System.out.println("On we go.");
						player.setName(name);
					} else
					{
						greetings();
					}
			}

		public static void makeBets()
			{
				System.out.println(player.getName() + " you currently have " + player.getMoney() + " dollars!");
				System.out.println(player.getName() + " how much would you like to bet?");
				bet = userInputInt.nextInt();
				if (bet > player.getMoney() || bet < 0)
					{
						System.out.println("Invalid Bet");
						makeBets();
					}
				System.out.println("To confirm your bet is " + bet);
				System.out.println("Yes or No");
				String response = userInput.nextLine();
				if (response.equals("Yes") || response.equals("yes"))
					{
						System.out.println("On we go.");
						dealCards();
					} else
					{
						makeBets();
					}

			}

		public static void dealCards()
			{
				System.out.println("(Press Enter to be Dealt Cards...)");
				userInput.nextLine();
				System.out.println(player.getName() + "'s cards are...");
				for (int i = 0; i < 2; i++)
					{
						playerHand.add(Deck.deck.get(0));
						System.out.println(Deck.deck.get(0).getRank() + " of " + Deck.deck.get(0).getSuit());
						playerTotal += Deck.deck.get(0).getValue();
						Deck.deck.remove(0);

					}
				System.out.println(player.getName() + "'s cards total " + playerTotal);
				System.out.println("(Press Enter to Deal Cards...)");
				userInput.nextLine();
				System.out.println("The computer's showing card is the...");
				for (int i = 0; i < 1; i++)
					{
						computerHand.add(Deck.deck.get(0));
						System.out.println(Deck.deck.get(0).getRank() + " of " + Deck.deck.get(0).getSuit());
						computerTotal = Deck.deck.get(0).getValue() + Deck.deck.get(0).getValue();
						Deck.deck.remove(0);
					}
				System.out.println("(Press Enter to Continue...)");
				userInput.nextLine();
			}

		public static void hitOrStay()
			{
				System.out.println("You cards currently total " + playerTotal);
				System.out.println(player.getName() + " would you like to hit or stay?");
				String response = userInput.nextLine();
				if (response.equals("Hit") || response.equals("hit"))
					{
						playerHand.add(Deck.deck.get(0));
						System.out.println(player.getName() + " drew the...");
						System.out.println(Deck.deck.get(0).getRank() + " of " + Deck.deck.get(0).getSuit());
						playerTotal = playerTotal + Deck.deck.get(0).getValue();
						System.out.println("(Press Enter to Continue)");
						userInput.nextLine();
						Deck.deck.remove(0);
						hitOrStay();
					} else if (response.equals("Stay") || response.equals("stay"))
					{
						System.out.println(player.getName() + "'s total is...");
						System.out.println("(Press Enter to Continue)");
						userInput.nextLine();
						System.out.println(playerTotal);
						System.out.println("The Computer's total currently is...");
						System.out.println("(Press Enter to Continue)");
						userInput.nextLine();
						System.out.println(computerTotal);
						winOrLose();
					} else
					{
						System.out.println("ERROR... Invalid response, try again!");
						hitOrStay();
					}

			}

		public static void winOrLose()
			{
				if (computerTotal < 17)
					{
						System.out.println("The computer chose to hit...");
						System.out.println("(Press Enter to Continue)");
						userInput.nextLine();
						computerHand.add(Deck.deck.get(0));
						System.out.println(Deck.deck.get(0).getRank() + " of " + Deck.deck.get(0).getSuit());
						computerTotal += Deck.deck.get(0).getValue();
						Deck.deck.remove(0);
						System.out.println("The Computer's total currently is...");
						System.out.println("(Press Enter to Continue)");
						userInput.nextLine();
						System.out.println(computerTotal);
						winOrLose();
					} else if (playerTotal > 21)
					{

						System.out.println("BUST! You went over 21! LOOSER!");
						System.out.println("Your balence currently is...");
						System.out.println("(Press Enter to Continue)");
						player.setMoney(player.getMoney() - bet);
						userInput.nextLine();
						System.out.println(player.getMoney());
						playAgain();
					} else if (computerTotal > 21)
					{
						System.out.println("BUST! The computer went over 21! You WIN!");
						player.setMoney(player.getMoney() + bet);
						System.out.println("Your balence currently is...");
						System.out.println("(Press Enter to Continue)");
						userInput.nextLine();
						System.out.println(player.getMoney());
						playAgain();
					} else if (computerTotal < playerTotal)
					{
						System.out.println("Congragulations! Winner!!!");
						player.setMoney(player.getMoney() + bet);
						System.out.println("Your balence currently is...");
						System.out.println("(Press Enter to Continue)");
						userInput.nextLine();
						System.out.println(player.getMoney());
						playAgain();
					} else if (computerTotal == playerTotal)
					{
						System.out.println("It's a tie! OMG!");
						System.out.println("Your balence currently is...");
						System.out.println("(Press Enter to Continue)");
						userInput.nextLine();
						System.out.println(player.getMoney());
						playAgain();
					} else if (computerTotal > playerTotal)
					{
						System.out.println("LOOOOSEERRRRR!!!!!!");
						player.setMoney(player.getMoney() - bet);
						System.out.println("Your balence currently is...");
						System.out.println("(Press Enter to Continue)");
						userInput.nextLine();
						System.out.println(player.getMoney());
						playAgain();
					} else
					{
						System.out.println("Nice you broke my game:)");
					}
			}

		public static void playAgain()
			{
				System.out.println("Would you like to play again?");
				System.out.println("Yes or No");
				String response = userInput.nextLine();
				if (response.equals("Yes") || response.equals("yes"))
					{
						System.out.println("On we go.");
						playerTotal = 0;
						computerTotal = 0;
					} else if (response.equals("No") || response.equals("no"))
					{
						System.out.println("Thanks for playing!");
						playerWantsToPlay = false;

					} else
					{
						playAgain();
					}
			}

	}
