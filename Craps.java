
/**
 * Write a description of class Craps here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Craps
{    
    /**
     * Creates the dice and rolls it until result
     * @param args  an argument for the array
     */
    public static void main(String[] args)
    {
        // Making dice instances
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        
        final int LOSE1 = 2;
        final int LOSE2 = 3;
        final int LOSE3 = 12;
        final int SEVEN = 7;
        final int WIN = 11;
        int shot = 0;
        int total = 0;
        int point = 0;
        
        shot = d1.getRoll() + d2.getRoll();
        System.out.println("You rolled a " + shot);
        
        // Checking the rolled number
        if (shot != LOSE1 && shot != LOSE2 &&
            shot != LOSE3 && shot != SEVEN && shot != WIN)
            {
                while (shot != point && shot != SEVEN)
                    {
                    System.out.println("You have established " + shot + " as the point");
                    point = shot;
                    shot = d1.getRoll() + d2.getRoll();
                    System.out.println("You rolled a " + shot);
                }
                if (shot == point)
                    System.out.println("You won");
                
                else
                    System.out.println("You lost");
            }
        else if (shot == SEVEN || shot == WIN)
            System.out.println("You won");
        
        else
            System.out.println("You lost");
    }
}
