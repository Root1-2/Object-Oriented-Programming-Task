/*-----------------------------------
  Abdullah Al Masrur            
  Section: F                   
  Student ID: 2012020255                           
  email: cse_2012020255@lus.ac.bd  
  Date: 12/09/21                   
 -----------------------------------*/

package Abdullah;

public class Cricket extends Sports {
    String matchType;
    int over;
    Player player;

    Cricket(String matchType, int over, Player player)
    {
        this.matchType = matchType;
        this.over = over;
        this.player = player;
    }

    void display()
    {
        System.out.println("Match type: "+matchType);
        System.out.println("Over of the match: "+over);
        System.out.println("Name of a player: "+player.playerName);
        System.out.println("Jersey number of a player: "+player.jerseyNumber);

    }
}
