/**
 * 
 * @author Linh Nguyen
 *
 */
public class Goalie extends Player
{
	/**
	 * call the default Player's contructor
	 * @param name
	 */
	public Goalie(String name)
	{
		super(name);
		setOffenceBehavior();
		setDefenceBehavior();
	}
	/**
	 * "setDefenceBehavior" set to "BlockGoalBehavior"
	 */
	public void setDefenceBehavior()
	{
		defenceBehavior= new BlockGoalBehavior();
	}
	/**
	 * "set OffenceBehavior" also set to "BlockGoalBehavior"
	 */
	public void setOffenceBehavior()
	{
		offenceBehavior = new BlockGoalBehavior();
	}
	/**
	 * toString method with the player's name, their position and their actions
	 */
	public String toString()
	{
		return this.name + " plays the position: Goalie "+
				this.offenceBehavior +
				this.defenceBehavior;
	}
}
