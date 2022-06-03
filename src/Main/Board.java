package Main;

import javax.swing.JLabel;

public class Board {
	public boolean winRow(JLabel[][] matrix) {
		for (int i = 0; i < 3;) {
			if (matrix[i][0].getText().equals("x") && matrix[i][1].getText().equals("x")
					&& matrix[i][2].getText().equals("x")) {
				return true;
			} else if (matrix[i][0].getText().equals("o") && matrix[i][1].getText().equals("o")
					&& matrix[i][2].getText().equals("o")) {
				return true;
			}
		}
		return false;
	}

	public void winColumn(String[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[0][i] == " 0 " && matrix[1][i] == " 0 " && matrix[3][i] == " 0 ") {
				System.out.println("totito - 0");
			}
		}
	}
}
