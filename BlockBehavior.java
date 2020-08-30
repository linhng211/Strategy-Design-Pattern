import java.util.Random;
/**
 * 
 * @author Linh Nguyen
 * a class implements from "Defencebehavior" interface
 *
 */
public class BlockBehavior implements DefenceBehavior
{
	/**
	 * the "play" method randomly pick 1 of 3 String and return that String
	 */
	public String play()
	{
		String [] e = {"blocks player from passing","blocks player from shooting","checks player with puck"};
		Random r = new Random();
		int randomNum=r.nextInt(e.length);
		return e[randomNum];
	}
}
