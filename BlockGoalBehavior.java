import java.util.Random;
/**
 * 
 * @author Linh Nguyen
 * a class implements from "Defencebehavior" interface as well as "OffenceBehavior" interface
 *
 */
public class BlockGoalBehavior implements DefenceBehavior, OffenceBehavior
{
	/**
	 * the "play" method randomly pick 1 of 4 String and return that String
	 */
	public String play() 
	{
		String [] f = {"hand blocks the puck","catches the puck","blocks puck with knee pads","blocks puck with stick"};
		Random r = new Random();
		int randomNum=r.nextInt(f.length);
		return f[randomNum];
	}
}
