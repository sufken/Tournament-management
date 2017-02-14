import java.util.ArrayList;

/**
 * The "Tournament" Class is used to save data for tournaments
 * 
 * @author Marcel Baumann
 *
 */
public class Tournament {
	
	/**
	 * the name of the Tournament
	 */
	public String name;
	
	/**
	 * the number of rounds to play (-1 is standard and indicates a system that is not round-based)
	 */
	public int rounds = -1;
	
	/**
	 * the round that the tournament is currently in
	 */
	public int round = 1;
	
	/**
	 * a list of play-tables for the tournament
	 */
	public ArrayList<Table> tableArr = new ArrayList<Table>();
	
	/**
	 * a list of all participant (Players or Teams)
	 */
	public ArrayList<Participant> participants = new ArrayList<Participant>();
	
	/**
	 * the tournament mode
	 */
	public int mode;
}