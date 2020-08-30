import java.util.Random;
/**
 * 
 * @author Linh Nguyen
 *
 */
public class Forward  extends Player
{
	/**
	 * call the default Player's contructor
	 * @param name
	 */
	public Forward(String name)
	{
		super(name);
		setOffenceBehavior();
		setDefenceBehavior();
	}
	/**
	 * "setDefenceBehavior" randomly choose between "ChasePuckBehavior" and "BlockBehavior"
	 */
	public void setDefenceBehavior()
	{
		Random a = new Random();
		if (a.nextBoolean()) 
		{
		    defenceBehavior=new ChasePuckBehavior();
		} 
		else 
		{
			defenceBehavior=new BlockBehavior();
		}
	}
	/**
	 * "setOffenceBehavior" randomly choose between "PassBehavior" and "ShootBehavior"
	 */
	public void setOffenceBehavior()
	{
		Random b = new Random();
		if (b.nextBoolean()) 
		{
		    offenceBehavior=new PassBehavior();
		} 
		else
		{
			offenceBehavior=new ShootBehavior();
		}
	}
	/**
	 * toString method with the player's name, their position and their actions
	 */
	public String toString()
	{
		return this.name+" plays the position: Forward "+ 
				this.offenceBehavior +
				this.defenceBehavior;
	}
}
