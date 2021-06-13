
import java.util.Scanner;

public class PlusOrMinus
{
    public static void main( String[] args )
    {
        Scanner s = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);

        String namePlayer1;
        String namePlayer2;
        String namePlayer3;
        String namePlayer4;
        String namePlayer5;
        int plusOrMinus1;
        int plusOrMinus2;
        int plusOrMinus3;
        int plusOrMinus4;
        int plusOrMinus5;
        int totalPlusOrMinus; 

    System.out.println("This program will calculate a team's lineup of 5 players total +/- (called plus-minus) on the court together. A player's individual +/-"); 
    System.out.println("comes from how many points their team scored with that player on the court subtracted by how many points the other team scored while that");
    System.out.println("player was on the court. For example, if the Cleveland Cavaliers scored 20 points with Lebron James on the court while the Chicago Bulls scored");
    System.out.println("12 points with Lebron James on the court (Lebron James' team is Cleveland in this case), Lebron James' +/- would be +8 (20 - 12). Usually, you");
    System.out.println("can find +/- of a player on the box score of a game or their average +/- throughout the season/their career. This program is meant to be used");
    System.out.println("+/- for players in specific games, rather than a players' season/career. It will ask for the name of 5 players and their +/- in an individual");
    System.out.println("game (preferably). It will add up all these +/-'s together and give a specific message on if that lineup of 5 players would play well");
    System.out.println("together or not. Generally, a +/- of +3 or above is considered to be good while a +/- of -3 or below is considered to  be bad. Users of this");
    System.out.println("program can run this program to see which 5 players can play well together and which ones would not play well together."); 
    System.out.println();
    System.out.println();
    System.out.println(); 
    
        System.out.println("Enter the name of the first player: ");
        namePlayer1 = s.nextLine(); 

        System.out.println("Enter the +/- for: " + namePlayer1);
        plusOrMinus1 = s2.nextInt(); 

        System.out.println("Enter the name of the second player: ");
        namePlayer2 = s.nextLine(); 

        System.out.println("Enter the +/- for: " + namePlayer2);
        plusOrMinus2 = s2.nextInt();

        System.out.println("Enter the name of the third player: ");
        namePlayer3 = s.nextLine(); 

        System.out.println("Enter the +/- for: " + namePlayer3);
        plusOrMinus3 = s2.nextInt();

        System.out.println("Enter the name of the fourth player: ");
        namePlayer4 = s.nextLine(); 

        System.out.println("Enter the +/- for: " + namePlayer4);
        plusOrMinus4 = s2.nextInt();

        System.out.println("Enter the name of the fifth player: ");
        namePlayer5 = s.nextLine(); 

        System.out.println("Enter the +/- for: " + namePlayer5);
        plusOrMinus5 = s2.nextInt();

        totalPlusOrMinus = plusOrMinus1 + plusOrMinus2 + plusOrMinus3 + plusOrMinus4 + plusOrMinus5;

        System.out.println("The lineup of " + namePlayer1 + ", " + namePlayer2 + ", " + namePlayer3 + ", " + namePlayer4 + ", and " + namePlayer5 + " has a total +/- of: " + totalPlusOrMinus); 

        if (totalPlusOrMinus <= -3) {
            System.out.println("This is a bad team +/-. You should avoid playing these 5 players together.");          
        }
        else if (totalPlusOrMinus > -3 && totalPlusOrMinus < 0) {
            System.out.println("This is a somewhat bad team +/-. You should change their plays up so they can score more than the opponent.");          
        }
        else if (totalPlusOrMinus == 0) {
            System.out.println("The team scored the same as the opponents. That's not bad but try to change their plays up so they can have a positive +/-.");          
        }
        else if (totalPlusOrMinus > 0 && totalPlusOrMinus < 3) {
            System.out.println("This is a somewhat good team +/-. They're already doing good but to get an even great +/-, try to create new plays.");          
        }
        else {
            System.out.println("This is a good team +/-. There's nothing much to change really, continue to play these 5 players together."); 
        }
    }
}

