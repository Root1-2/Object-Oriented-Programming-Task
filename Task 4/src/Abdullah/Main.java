/*-----------------------------------
  Abdullah Al Masrur            
  Section: F                   
  Student ID: 2012020255                           
  email: cse_2012020255@lus.ac.bd  
  Date: 12/09/21                   
 -----------------------------------*/
package Abdullah;


public class Main {

    public static void main(String[] args)
    {
        Player player = new Player("Shakib",75 );
        Cricket cricket = new Cricket("International match",20, player);

        cricket.display();
        Football football = new Football();
    }
}
