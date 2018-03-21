package firstjava;

public class eArrays {

	public static void main(String[] args) {
		
	int [] schrank = {1, 2, 3, 4, 5, 6, 7, 8};
	
	System.out.println("In der Lade 1 = " +schrank[0]);
	
	int laenge = schrank.length;
	
	System.out.println("Die länge vom Array = " +laenge);
	
	System.out.println("Der Inhalt von Position 4 = " +schrank[3]);
	
	schrank[3] = 66;

	System.out.println("Der Inhalt von Position 4 ist nun: " +schrank[3]);
	
	String [] array = new String [4];
	
	array[0] = "Hallo,";
	array[1] = "Du";
	array[2] = "bist";
	array[3] = "cool!";
	
	for (int i = 0; i<array.length; i++) {
		
		System.out.print(array[i] + " ");
	}
	System.out.println();
	System.out.println("Die länge vom Array = " +array.length);
	}	
	
	
}
