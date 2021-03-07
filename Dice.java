
/**
 * Write a description of class Dice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dice
{
    // Fields
    private int roll;
    private final int SIDES = 6;
    
    /**
     * Setup the dice by rolling it initially
     */
    public Dice()
    {
        this.Roll();
    }
    
    /**
     * Roll the dice by choosing a random number
     */
    public void Roll()
    {
        roll = (int) (Math.random() * SIDES);
    }
    
    /**
     * Returns the total of the dice rolls
     */
    public int getRoll()
    {
        return roll;
    }
}
