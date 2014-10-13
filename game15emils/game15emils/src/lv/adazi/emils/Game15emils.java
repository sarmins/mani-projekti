package lv.adazi.emils;

import java.util.Random;

public class Game15emils {

	static int[][] slots = new int[4][4];

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random r = new Random();
//		slots[0][0] = r.nextInt(16);
		
		for (int i = 1; i <= 15; i++) {
			boolean found = false;
			while (!found) {
				int row = r.nextInt(4);
				int col = r.nextInt(4);
				if (slots[row][col] == 0) {
					slots[row][col] = i;
					found = true;
				}
			}
		}
		

		// for (int i = 0; i < 4; i++) {
		// for (int j = 0; j < 4; j++)
		//
		// {
		// laucini[i][j] = r.nextInt(16);
		// }
		// }
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(", " + slots[i][j]);
			}
			System.out.print("\n");

		}

		// TODO Auto-generated method stub

	}
}
