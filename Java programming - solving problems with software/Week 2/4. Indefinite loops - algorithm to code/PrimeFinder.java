/**
 * For a given number, determines whether or not it is prime.
 *
 * @author Duke Software Team 
 */
import edu.duke.*;
import java.io.*;

public class PrimeFinder {
	public boolean isPrime(int num) {
		int div = 2;
		if (num == 2) {
			return true;
		}
		while (true) {
			if (num % div == 0) {
			    // Find divisor? Not prime!
				return false;
			}
			if (div > Math.sqrt(num)) {
				break;
			}
			// Ensure loop breaks by increasing div
			div = div + 1;
		}
		// Tried all divisors? Prime
		return true;
	}

	public void testPrimes() {
		RangeResource rr = new RangeResource(2, 200);
		for (int value : rr.sequence()){
			if (isPrime(value)) {
				System.out.println(value + "\t is prime");
			}
		}
	}

}