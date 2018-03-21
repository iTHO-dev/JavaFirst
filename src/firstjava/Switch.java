package firstjava;

import java.util.Random;

public class Switch {

	public static void main(String[] args) {
		
		int temperatur;
		
		Random rn = new Random();

		temperatur = rn.nextInt(10) + 1; // +1 damit auch 10 erreicht wird
		
		switch (temperatur) {
		
		case 0 : System.out.println("Das Bier hat 0 Grad"); break;
		case 1 : System.out.println("Das Bier hat einen Grad"); break;
		case 2 : System.out.println("Das Bier hat zwei Grad"); break;
		case 3 : System.out.println("Das Bier hat drei Grad"); break;
		case 4 : System.out.println("Das Bier hat vier Grad"); break;
		case 5 : System.out.println("Das Bier hat fünf Grad"); break;
		case 6 : System.out.println("Das Bier hat sechs Grad"); break;
		case 7 : System.out.println("Perfekt!! Das Bier hat sieben Grad"); break;
		default : System.out.println("Das Bier ist mir zu warm!!!"); break;
		
		}
		
	}

}
