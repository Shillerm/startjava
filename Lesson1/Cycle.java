public class Cycle {

	public static void main(String[] args) {
		for(int i = 0; i < 21; i++) {
			System.out.println("Number " + i);
		}

		int counter = 6;
		while(counter > -7) {
			System.out.println("Even number " + counter);
		counter -= 2;
		}

		counter = 10;
		int sumOdd = 0;
		do {
			counter++;
			if(counter % 2 != 0) {
				sumOdd += counter;
			}
		} while(counter < 20);
			System.out.println("Sum odd numbers" + sumOdd);
	}
}