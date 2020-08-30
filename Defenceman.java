import java.util.Random;
/**
 * 
 * @author Linh Nguyen
 *
 */
public class Defenceman extends Player
{
	/**
	 * 
	 * @param name
	 * call the default Player's contructor
	 */
	public Defenceman(String name)
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
		Random c = new Random();
		if (c.nextBoolean())
		{
		    defenceBehavior=new ChasePuckBehavior();
		} 
		else 
		{
			defenceBehavior=new BlockBehavior();
		}
	}
	/**
	 * "setOffenceBehavior" randomly choose between "PassBehavior" and "SlapShotBehavior"
	 */
	public void setOffenceBehavior()
	{
		Random d = new Random();
		if (d.nextBoolean()) 
		{
		    offenceBehavior=new PassBehavior();
		} 
		else 
		{
			offenceBehavior=new SlapShotBehavior();
		}
	}
	/**
	 * toString method with the player's name, their position and their actions
	 */
	public String toString()
	{
		return this.name+" plays the position: Defenceman" + 
				this.offenceBehavior+
				this.defenceBehavior;
	}
}
