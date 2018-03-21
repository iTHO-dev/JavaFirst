/**
 * 
 */

package firstjava;
import java.util.Random;
/**
 * @author hannes
 *
 */


public class bier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	int temperatur;
	
	Random rn = new Random();

	temperatur = rn.nextInt(10) + 1; // +1 damit auch 10 erreicht wird
	
	System.out.println("Die Temperatur vom Bier beträgt: " +temperatur +" Grad");
	
	if (temperatur < 7) {
		System.out.println("Yupp, ich trink ein Bier");
	}
	else if (temperatur == 7) {
		System.out.println("Optimal, ich will ein Bier!");
	}
	else {
		System.out.println("Nee, ich will ein kaltes Bier!");
	}
		
		// TODO Auto-generated method stub
 
	}

}
