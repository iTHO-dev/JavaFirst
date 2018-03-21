package firstjava;

public class WhileSchleife {

	public static void main(String[] args) {
	
	int a = 10;
	int b = 0;
	
	while(a>b) {
		System.out.println("Countdown a = " +a);
		a--;	
	}
	
	System.out.println("-------->>>>> Bumm <<<<<--------");
	a = 5;
	b = 0;
	
	do {
		System.out.println("Bam");
		b++;	
		} while (a>b);
	
	System.out.println("Party aus");
	}

}
