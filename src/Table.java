import java.util.ArrayList;

/**
 * The "Table" class is used to save data for different tables in a tournament (see tournament class)
 * 
 * @author Marcel Baumann
 *
 */
public class Table {
	
	/**
	 * the round-number (-1 is standard and indicates a system that is not round-based) 
	 */
	public int round = -1;
	
	/**
	 * optional group variable if the tournament is played in different groups (called by one letter)
	 */
	public char group;
	
	/**
	 * the list of matches that should be played in the round
	 */
	public ArrayList<Match> matches = new ArrayList<Match>();
}