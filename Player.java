import java.util.Random;
/**
 * 
 * @author Linh Nguyen
 * This is abstract base class
 */
public abstract class  Player 
{
	protected String name;
	private boolean offense=true;
	protected DefenceBehavior defenceBehavior;
	protected OffenceBehavior offenceBehavior;
	public Player(String name)
	{
		this.name = name;
	}
	/**
	 * constructor "setDefenceBehavior"
	 * @param db
	 */
	public void setDefenceBehavior(DefenceBehavior db)
	{
		defenceBehavior = db;
	}
	/**
	 * constructor "setOffenceBehavior"
	 * @param ob
	 */
	public void setOffenceBehavior(OffenceBehavior ob)
	{
		offenceBehavior = ob;
	}
	/**
	 * this method check for the null pointer and call appropriate play method then return the string
	 * @return
	 */
	public String play()
	{
		if(offense&& offenceBehavior != null)
		{
			offense=false;
			return offenceBehavior.play();
		}
		else 
		{
			return defenceBehavior.play();
		}
	}
	/**
	 * this method switch from offence to defence and vice versa
	 */
	public void turnover()
	{ 
		String curr=null;
		if(curr==offenceBehavior.play()&&offenceBehavior.play() != null)
		{
			curr=new String();
			curr=defenceBehavior.play();
		}
		else if(curr==defenceBehavior.play() && defenceBehavior.play() != null)
		{
			curr=new String();
			curr=offenceBehavior.play();
		}
	}
}
