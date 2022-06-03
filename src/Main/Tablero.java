package Main;

public class Tablero {	
	public String [][] startBoard() {
		String [][] board = new String [3][3];
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				board[i][j] = "   ";
			}
		}
		return board;
	}
	
	public void print(String [][] matrix) {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
	
	public void winRow(String [][] matrix) {
		for(String[] position: matrix) {
			if(position[0] == " 0 " && position[1] == " 0 " && position[2] == " 0 ") {
				System.out.println("totito 0 ");
			}
			else if(position[0] == " 1 " && position[1] == " 1 " && position[2] == " 1 "){
				System.out.println("totito 1 ");
			}
		}
	}
	
	public void winColumn(String [][] matrix) {
		for(int i = 0; i < matrix.length; i++) {
			if(matrix[0][i] == " 0 " && matrix[1][i] == " 0 " && matrix[3][i] == " 0 ") {
				System.out.println("totito - 0");
			}
		}
	}
}
