/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
	    Card s = new Card("", "", 3);
	    Card pv = new Card("", "", 4);
	    Card r = new Card("", "", 5);
	    s.suit();
	    pv.pointValue();
	    r.rank();
	}
}
