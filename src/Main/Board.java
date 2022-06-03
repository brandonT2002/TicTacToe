package Main;

public class Board {
	public void winRow(String[][] matrix) {
		for (String[] position : matrix) {
			if (position[0] == " 0 " && position[1] == " 0 " && position[2] == " 0 ") {
				System.out.println("totito 0 ");
			} else if (position[0] == " 1 " && position[1] == " 1 " && position[2] == " 1 ") {
				System.out.println("totito 1 ");
			}
		}
	}

	public void winColumn(String[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[0][i] == " 0 " && matrix[1][i] == " 0 " && matrix[3][i] == " 0 ") {
				System.out.println("totito - 0");
			}
		}
	}
}
