import java.util.ArrayList;

/**
 * The "participant" class is used to save data about a participant in a tournament
 * 
 * @author Marcel Baumann
 *
 */
public class Participant {
	
	/**
	 * the name of the team/player
	 */
	public String name;
	
	/**
	 * the points the participant has achieved
	 */
	public double points = 0;
	
	/**
	 * a list of opponents the participant already faced
	 */
	public ArrayList<Participant> opponents = new ArrayList<Participant>();
	
	/**
	 * the place the participant started in the tournament (could be determined by some sort of rating or just order of sign ins)
	 */
	public int startPlace;
}
