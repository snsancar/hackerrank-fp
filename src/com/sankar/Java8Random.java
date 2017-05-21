package src.com.sankar;

import java.util.Random;
import java.util.stream.IntStream;

public class Java8Random {

	public static void main(String[] args) {
		Random r = new Random();
		int[] fiveRandomNumbers = r.ints(11, 0, 11).toArray();
		int randomNumber = r.ints(1, 0, 11).findFirst().getAsInt();
		for (int i : fiveRandomNumbers) {
			System.out.println(i);
		}
	}
}
